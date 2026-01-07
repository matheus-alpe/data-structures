package org.example.algorithms.linked_list;

import org.example.data_structures.linked_list.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleLinkedListTest {
    @Test
    void case1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(3).add(2).add(0).add(4);
        list.next.next.next = list.next;
        assertTrue(CycleLinkedList.hasCycle(list));
    }

    @Test
    void case2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1).add(2);
        list.next = list;
        assertTrue(CycleLinkedList.hasCycle(list));
    }

    @Test
    void case3_false() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1);
        assertFalse(CycleLinkedList.hasCycle(list));
    }

    @Test
    void case4_false() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1).add(2);
        assertFalse(CycleLinkedList.hasCycle(list));
    }
}