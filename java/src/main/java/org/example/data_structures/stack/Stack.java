package org.example.data_structures.stack;

import org.example.data_structures.linked_list.Node;

import java.util.EmptyStackException;
import java.util.Objects;

public class Stack<T> {
    private int length = 0;
    private Node<T> top;

    public void push(T value) {
        Node<T> newNode = Node.of(value);
        newNode.next = this.top;
        this.top = newNode;
        this.length++;
    }

    public T pop() {
        checkEmpty();
        T value = top.value;
        this.top = top.next;
        this.length--;
        return value;
    }

    public T peek() {
        checkEmpty();
        return this.top.value;
    }

    public boolean isEmpty() {
        return Objects.isNull(this.top);
    }

    public int size() {
        return this.length;
    }

    private void checkEmpty() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
