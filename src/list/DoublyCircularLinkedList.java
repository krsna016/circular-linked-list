package list;
import node.Node;
import adt.AbstractClass;

public class DoublyCircularLinkedList implements AbstractClass{

    private Node head;
    private int size;
    private Node tail;
    public DoublyCircularLinkedList(){
        this.head = null;
        this.size = 0;
        this.tail = null;
    }

    @Override
    public boolean is_empty() {
        return false;
    }

    @Override
    public int get_size() {
        return Integer.MIN_VALUE;
    }

    @Override
    public void add_first(int data) {

    }

    @Override
    public void add_last(int data) {

    }

    @Override
    public void remove_first() {

    }

    @Override
    public void remove_last() {

    }

    @Override
    public void print_forward() {

    }

    @Override
    public void print_backward() {

    }

    @Override
    public void add_any() {

    }

    @Override
    public void remove_any() {

    }

    @Override
    public void reverse() {

    }
}