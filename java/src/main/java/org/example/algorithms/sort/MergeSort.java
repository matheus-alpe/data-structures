package org.example.algorithms.sort;

import org.example.data_structures.linked_list.SinglyLinkedList;

/**
 * - Time Complexity:   O(N log N)
 * - Space Complexity:  O(N)
 */
public class MergeSort {
    public static SinglyLinkedList<Integer> sort(SinglyLinkedList<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        var middle = findMiddle(head);
        var afterMiddle = middle.next;
        middle.next = null;

        var left = sort(head);
        var right = sort(afterMiddle);

        return merge(left, right);
    }

    public static SinglyLinkedList<Integer> findMiddle(SinglyLinkedList<Integer> head) {
        var slow = head;
        var fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static SinglyLinkedList<Integer> merge(SinglyLinkedList<Integer> l1, SinglyLinkedList<Integer> l2) {
        var head = new SinglyLinkedList<Integer>();
        var tail = head;

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        tail.next = l1 != null ? l1 : l2;

        return head.next;
    }
}
