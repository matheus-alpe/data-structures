package org.example.algorithms.linked_list;

import org.example.data_structures.linked_list.SinglyLinkedList;

public class ReverseLinkedList {
    // https://leetcode.com/problems/reverse-linked-list/description/
    public static <T> SinglyLinkedList<T> reverseList(SinglyLinkedList<T> head) {
        if (head == null) return null;

        int originalSize = head.size;
        SinglyLinkedList<T> newList = null;

        while(head != null) {
            SinglyLinkedList<T> nextNode = head.next;
            head.next = newList;
            newList = head;
            head = nextNode;
        }

        if (newList != null) {
            newList.size = originalSize;
        }
        return newList;
    }

}
