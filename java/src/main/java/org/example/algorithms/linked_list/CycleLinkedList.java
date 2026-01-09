package org.example.algorithms.linked_list;

import org.example.data_structures.linked_list.SinglyLinkedList;

public class CycleLinkedList {
    // https://leetcode.com/problems/linked-list-cycle/description/
    public static <T> boolean hasCycle(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> ahead = head;

        while(ahead != null && ahead.next != null) {
            head = head.next;
            ahead = ahead.next.next;

            if (head == ahead) {
                return true;
            }
        }

        return false;
    }
}
