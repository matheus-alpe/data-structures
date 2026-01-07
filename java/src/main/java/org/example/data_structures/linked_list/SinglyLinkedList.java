package org.example.data_structures.linked_list;

public class SinglyLinkedList<T> {
    public T value;
    public SinglyLinkedList<T> next;

    public SinglyLinkedList() {}

    public SinglyLinkedList(T value) {
        this.value = value;
    }

    public SinglyLinkedList<T> add(T newValue) {
        SinglyLinkedList<T> newNode = new SinglyLinkedList<>(newValue);
        SinglyLinkedList<T> end = this.next;

        if (end == null) {
            this.next = newNode;
        } else {
            while (end.next != null) {
                end = end.next;
            }
            end.next = newNode;
        }

        return this;
    }
}
