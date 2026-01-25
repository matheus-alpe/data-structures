package org.example.algorithms.stack;

import java.util.Objects;

// https://leetcode.com/problems/min-stack/description/
public class MinStack {
    private Node top;

    public MinStack() {
    }

    public void push(int val) {
        Node newNode = new Node(val, val);
        if (top != null) {
            newNode.next = top;
            newNode.currentMin = Math.min(val, top.currentMin);
        }
        top = newNode;
    }

    public void pop() {
        if (Objects.nonNull(top)) {
            top = top.next;
        }
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return top.currentMin;
    }

    public class Node {
        int value;
        int currentMin;
        Node next;

        public Node(int value, int currentMin) {
            this.value = value;
            this.currentMin = currentMin;
        }
    }
}
