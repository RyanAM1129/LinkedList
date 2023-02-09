package model;

public class Node<E> {
    private Node<E> next;
    private E value;

    /**
     * Default null constructor. Only use when neither the value or next node is given.
     */
    public Node() {
        this.next = null;
        this.value = null;
    }

    /**
     * Value input Constructor. Use only when just the value is given.
     * @param value the given value.
     */
    public Node(final E value) {
        this.next = null;
        this.value = value;
    }

    /**
     * Value and Next node constructor. Only use when both the next Node and value are given.
     * @param next the node after this node in the linked list.
     * @param value the given value.
     * */
    public Node(final Node next, final E value) {
        this.next = next;
        this.value = value;
    }

    /**
     * Mutator method for next field. Updates the next node of the current node to the given node.
     * @param next the next node in the Linked List.
     */
    public void setNext(final Node next) {
        this.next = next;
    }

    /**
     * Mutator method for value field. Updates the value of the current node to the given value.
     * @param value the given value.
     */
    public void setValue(final E value) {
        this.value = value;
    }

    /**
     * Accessor method for next field. Returns the next node in the Linked List.
     * @return the next node in the Linked List.
     */
    public Object getNext() {
        return this.next;
    }

    /**
     * Accessor method for value field. Returns the value of the current node.
     * @return the value of the node.
     */
    public Object getValue() {
        return this.value;
    }
}
