package adt;

import node.Node;

public interface AbstractClass {
    boolean is_empty();

    int get_size();

    void add_first(int data);

    void add_last(int data);

    void remove_first();

    void remove_last();

    void print_forward(Node head_);

    void print_backward(Node tail_);

    void add_any(int data, int position);

    void remove_any(int position);

    void reverse();

    boolean search_node(int data);
}