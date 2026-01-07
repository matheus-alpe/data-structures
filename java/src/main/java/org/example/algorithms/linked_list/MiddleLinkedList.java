package org.example.algorithms.linked_list;

import org.example.data_structures.linked_list.SinglyLinkedList;

public class MiddleLinkedList {
    // https://leetcode.com/problems/middle-of-the-linked-list/description/
    public static <T> SinglyLinkedList<T> middleNode(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> ahead = head;

        while (ahead != null && ahead.next != null) {
            ahead = ahead.next.next;
            head = head.next;
        }

        return head;
    }
}
