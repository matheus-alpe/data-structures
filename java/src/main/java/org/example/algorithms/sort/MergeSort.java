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

    private static SinglyLinkedList<Integer> findMiddle(SinglyLinkedList<Integer> head) {
        var slow = head;
        var fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static SinglyLinkedList<Integer> merge(SinglyLinkedList<Integer> l1, SinglyLinkedList<Integer> l2) {
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

    public class OnArray {
        // https://leetcode.com/problems/sort-an-array/
        public static void mergeSort(int[] array, int low, int high) {
            if (low >= high) {
                return;
            }
            int mid = low + (high - low) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            mergeArray(array, low, mid, high);
        }

        private static void mergeArray(int[] array, int low, int mid, int high) {
            int n1 = mid - low + 1;
            int n2 = high - mid;
            int[] leftPart = new int[n1];
            int[] rightPart = new int[n2];

            System.arraycopy(array, low, leftPart, 0, n1);
            System.arraycopy(array, mid + 1, rightPart, 0, n2);

            int p1 = 0, p2 = 0, writeInd = low;
            while (p1 < n1 && p2 < n2) {
                if (leftPart[p1] <= rightPart[p2]) {
                    array[writeInd++] = leftPart[p1++];
                } else {
                    array[writeInd++] = rightPart[p2++];
                }
            }

            while (p1 < n1) {
                array[writeInd++] = leftPart[p1++];
            }

            while (p2 < n2) {
                array[writeInd++] = rightPart[p2++];
            }
        }
    }
}
