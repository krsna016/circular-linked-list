package circularLinkedList;

import circularLinkedList.CircularLinkedList;
public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        System.out.println("IsEmpty : " + cll.is_empty());
        System.out.println("The size is : " + cll.get_size());

        cll.add_first(10);
        cll.add_first(20);
        cll.add_first(30);
        cll.print_forward(cll.head);
        cll.print_backward(cll.tail);

        cll.add_last(40);
        cll.add_last(50);
        cll.add_last(60);
        cll.print_forward(cll.head);
        cll.print_backward(cll.tail);

        cll.remove_first();
        cll.remove_first();
        cll.print_forward(cll.head);

        cll.add_any(20, 2);
        cll.add_any(30, 3);
        cll.print_forward(cll.head);

        cll.remove_last();
        cll.remove_last();
        cll.print_forward(cll.head);

        System.out.println("The size is : " + cll.get_size());

        cll.remove_any(2);
        cll.print_forward(cll.head);

        System.out.println("Node is present : " + cll.search_node(20));

        System.out.println(cll.tail);
        cll.add_last(40);
        cll.add_last(50);
        cll.add_last(60);
        cll.print_forward(cll.head);
        System.out.println("The tail is : " + cll.tail + " and the head is : " + cll.head);

        cll.reverse();
        cll.print_forward(cll.head);
        System.out.println("The tail is : " + cll.tail + " and the head is : " + cll.head);
    }
}