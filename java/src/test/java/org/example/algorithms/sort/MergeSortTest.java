package org.example.algorithms.sort;

import org.example.data_structures.linked_list.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {
    @Test
    void case1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(9).add(3).add(1).add(2).add(7).add(6);
        var result = MergeSort.sort(list);
        assertEquals(1, result.value);
        assertEquals(2, result.next.value);
        assertEquals(3, result.next.next.value);
        assertEquals(6, result.next.next.next.value);
        assertEquals(7, result.next.next.next.next.value);
        assertEquals(9, result.next.next.next.next.next.value);
    }

    @Test
    void case1_Arrays() {
        int[] nums = {5, 4, 3, 2, 1};
        MergeSort.OnArray.mergeSort(nums, 0, nums.length - 1);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(4, nums[3]);
        assertEquals(5, nums[4]);
    }
}