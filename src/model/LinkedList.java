package model;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int length;

    /**
     * Empty default constructor. Creates an empty Linked List.
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    
}
