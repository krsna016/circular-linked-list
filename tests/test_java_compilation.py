import unittest
import subprocess
import os
import glob

class TestJavaCompilation(unittest.TestCase):
    
    def test_javac_compilation_integrity(self):
        # We test all Java files in the src directory to ensure they compile correctly
        # This guarantees zero syntax errors and that the OOP package structure is intact.
        base_dir = os.path.dirname(os.path.dirname(__file__))
        src_dir = os.path.join(base_dir, "src")
        
        # Recursively find all java files
        java_files = []
        for root, dirs, files in os.walk(src_dir):
            for file in files:
                if file.endswith(".java"):
                    java_files.append(os.path.join(root, file))
        
        self.assertTrue(len(java_files) > 0, "No Java files found to compile.")
        
        # Execute the Java Compiler with sourcepath to resolve cross-package dependencies
        cmd = ["javac", "-sourcepath", src_dir] + java_files
        result = subprocess.run(cmd, capture_output=True, text=True)
        
        self.assertEqual(
            result.returncode, 
            0, 
            msg=f"Java compilation failed:\n{result.stderr}"
        )
            
        # Clean up the generated .class files after compilation
        for file in java_files:
            class_file = file.replace(".java", ".class")
            if os.path.exists(class_file):
                os.remove(class_file)

if __name__ == '__main__':
    unittest.main()
