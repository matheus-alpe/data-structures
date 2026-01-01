package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    void addToFront_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToFront(1);
        assertEquals(Integer.valueOf(1), list.removeFromFront());
    }

    @Test
    void addToFront_NonEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToFront(1);
        list.addToFront(2);
        assertEquals(Integer.valueOf(2), list.removeFromFront());
        assertEquals(Integer.valueOf(1), list.removeFromFront());
    }

    @Test
    void addToEnd_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToEnd(1);
        assertEquals(Integer.valueOf(1), list.removeFromEnd());
    }

    @Test
    void addToEnd_NonEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToEnd(1);
        list.addToEnd(2);
        assertEquals(Integer.valueOf(2), list.removeFromEnd());
        assertEquals(Integer.valueOf(1), list.removeFromEnd());
    }

    @Test
    void removeFromFront_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertNull(list.removeFromFront());
    }

    @Test
    void removeFromEnd_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertNull(list.removeFromEnd());
    }

    @Test
    void mixedOperations() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addToFront("a");
        list.addToEnd("b");
        list.addToFront("c");

        assertEquals("c", list.removeFromFront());
        assertEquals("b", list.removeFromEnd());
        assertEquals("a", list.removeFromFront());
        assertNull(list.removeFromFront());
    }

    @Test
    void size_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertEquals(0, list.size());
    }

    @Test
    void size_AfterAdditions() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToFront(1);
        assertEquals(1, list.size());
        list.addToEnd(2);
        assertEquals(2, list.size());
        list.addToFront(3);
        assertEquals(3, list.size());
    }

    @Test
    void size_AfterRemovals() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToFront(1);
        list.addToEnd(2);
        list.removeFromFront();
        assertEquals(1, list.size());
        list.removeFromEnd();
        assertEquals(0, list.size());
    }

    @Test
    void isEmpty_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    void isEmpty_NonEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToFront(1);
        assertFalse(list.isEmpty());
    }

    @Test
    void isEmpty_AfterRemovingAll() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addToFront(1);
        list.removeFromFront();
        assertTrue(list.isEmpty());
    }
}
