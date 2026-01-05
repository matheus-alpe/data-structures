package org.example.algorithms.linked_list;

import org.example.data_structures.linked_list.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void case1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1);
        list.add(2);

        assertEquals(1, list.value);
        assertEquals(2, list.next.value);
        assertEquals(2, list.size);

        SinglyLinkedList<Integer> reversed = ReverseLinkedList.reverseList(list);
        assertEquals(2, reversed.size);
        assertEquals(2, reversed.value);
        assertEquals(1, reversed.next.value);

        assertEquals(list.size, reversed.size);
    }

    @Test
    void reverseEmptyList() {
        assertNull(ReverseLinkedList.reverseList(null));
    }

    @Test
    void reverseSingleNode() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1);
        SinglyLinkedList<Integer> reversed = ReverseLinkedList.reverseList(list);
        assertEquals(list.size, reversed.size);
        assertEquals(1, reversed.value);
        assertNull(reversed.next);
    }

    @Test
    void reverseMultipleNodes() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1).add(2).add(3);

        SinglyLinkedList<Integer> reversed = ReverseLinkedList.reverseList(list);
        assertEquals(list.size, reversed.size);
        assertEquals(3, reversed.value);
        assertEquals(2, reversed.next.value);
        assertEquals(1, reversed.next.next.value);
        assertNull(reversed.next.next.next);
    }
}
