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
}