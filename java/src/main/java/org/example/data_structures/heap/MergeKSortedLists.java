package org.example.data_structures.heap;

import org.example.algorithms.linked_list.MergeTwoLinkedList.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    // https://leetcode.com/problems/merge-k-sorted-lists/description/
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll();
            current.next = smallestNode;
            current = current.next;
            if (smallestNode.next != null) {
                minHeap.offer(smallestNode.next);
            }
        }
        return dummyHead.next;
    }
}
