package org.example.algorithms.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeTwoLinkedListTest {
    @Test
    void case1() {
        var list1 = new MergeTwoLinkedList.ListNode(1, new MergeTwoLinkedList.ListNode(2, new MergeTwoLinkedList.ListNode(4)));
        var list2 = new MergeTwoLinkedList.ListNode(1, new MergeTwoLinkedList.ListNode(3, new MergeTwoLinkedList.ListNode(4)));
        var result = new MergeTwoLinkedList().mergeTwoLists(list1, list2);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
    }

    @Test
    void case2() {
        var list1 = new MergeTwoLinkedList.ListNode();
        var list2 = new MergeTwoLinkedList.ListNode(0);
        var result = new MergeTwoLinkedList().mergeTwoLists(list1, list2);
        assertEquals(0, result.val);
    }
}