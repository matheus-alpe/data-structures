package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void singleCase() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1);

        assertEquals(1, list.value);
        assertNull(list.next);
    }

    @Test
    void dualCase() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1).add(2);
        assertEquals(1, list.value);
        assertEquals(2, list.next.value);
        assertNull(list.next.next);
    }

    @Test
    void multipleCase() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1).add(2).add(3).add(4);
        assertEquals(1, list.value);
        assertEquals(2, list.next.value);
        assertEquals(3, list.next.next.value);
        assertEquals(4, list.next.next.next.value);
        assertNull(list.next.next.next.next);
    }
}
