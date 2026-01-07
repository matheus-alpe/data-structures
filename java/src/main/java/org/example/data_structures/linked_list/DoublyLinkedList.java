package org.example.data_structures.linked_list;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void addToFront(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;

        if (this.head != null) {
            this.head.prev = newNode;
        } else {
            this.tail = newNode;
        }

        this.head = newNode;
    }

    public void addToEnd(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.prev = tail;

        if (this.tail != null) {
            this.tail.next = newNode;
        } else {
            this.head = newNode;
        }

        this.tail = newNode;
    }

    public T removeFromFront() {
        if (this.head == null) {
            return null;
        }
        T removedValue = this.head.value;
        this.head = this.head.next;
        if (this.head != null) {
            this.head.prev = null;
        } else {
            this.tail = null;
        }
        return removedValue;
    }

    public T removeFromEnd() {
        if (this.tail == null) {
            return null;
        }
        T removedValue = this.tail.value;
        this.tail = this.tail.prev;
        if (this.tail != null) {
            this.tail.next = null;
        } else {
            this.head = null;
        }
        return removedValue;
    }
}
