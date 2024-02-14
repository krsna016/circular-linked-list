package main;

import list.DoublyCircularLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.add_first(1);
        list.add_first(2);
        list.add_first(3);
        list.add_first(4);
        list.add_first(5);
        list.add_first(6);
        list.add_first(7);
        list.add_first(8);
        list.add_first(9);
        list.add_first(10);
//        list.print_forward();
//        list.print_backward();
        list.add_last(11);
        list.add_last(12);
        list.add_last(13);
        list.add_last(14);
        list.add_last(15);
        list.add_last(16);
        list.add_last(17);
        list.add_last(18);
        list.add_last(19);
        list.add_last(20);

        list.remove_first();
        list.remove_first();
        list.remove_first();
        list.remove_first();
        list.remove_first();

        list.remove_last();
        list.remove_last();
        list.remove_last();
        list.remove_last();
        list.remove_last();

        list.print_forward(list.head);
        list.print_backward(list.tail);
        list.add_any(100, 5);
        list.remove_any(6);
        list.reverse();
        list.print_forward(list.head);
        System.out.println("Node is present : " +list.search_node(100));
        list.search_node(10);

    }
}