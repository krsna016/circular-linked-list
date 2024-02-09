package adt;
public interface AbstractClass {
    boolean is_empty();
    int get_size();
    void add_first(int data);
    void add_last(int data);
    void remove_first();
    void remove_last();
    void print_forward();
    void print_backward();
    void add_any();
    void remove_any();
    void reverse();
}