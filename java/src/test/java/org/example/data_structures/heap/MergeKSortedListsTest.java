package org.example.data_structures.heap;

import org.example.algorithms.linked_list.MergeTwoLinkedList.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeKSortedListsTest {
    @Test
    public void testMergeKLists() {
        MergeKSortedLists merger = new MergeKSortedLists();

        ListNode[] lists = getListNodes();

        ListNode mergedHead = merger.mergeKLists(lists);

        int[] expectedValues = {1, 1, 2, 3, 4, 4, 5, 6};
        for (int value : expectedValues) {
            assertNotNull(mergedHead);
            assertEquals(value, mergedHead.val);
            mergedHead = mergedHead.next;
        }
        assertNull(mergedHead);
    }

    private static ListNode[] getListNodes() {
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        return new ListNode[]{list1, list2, list3};
    }

}