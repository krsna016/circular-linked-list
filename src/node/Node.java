package node;

public class Node {
    public Node previous;
    public int data;
    public Node next;

    public Node(int data) {
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public Node(Node previous, int data, Node next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + (next != null ? next.data : "null") +
                '}';
    }
}