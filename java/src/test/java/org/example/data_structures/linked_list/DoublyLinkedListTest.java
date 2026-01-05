package org.example.data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void addToFront_EmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToFront(1);
        assertEquals(Integer.valueOf(1), list.removeFromFront());
    }

    @Test
    void addToFront_NonEmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToFront(1);
        list.addToFront(2);
        assertEquals(Integer.valueOf(2), list.removeFromFront());
        assertEquals(Integer.valueOf(1), list.removeFromFront());
    }

    @Test
    void addToEnd_EmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToEnd(1);
        assertEquals(Integer.valueOf(1), list.removeFromEnd());
    }

    @Test
    void addToEnd_NonEmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToEnd(1);
        list.addToEnd(2);
        assertEquals(Integer.valueOf(2), list.removeFromEnd());
        assertEquals(Integer.valueOf(1), list.removeFromEnd());
    }

    @Test
    void removeFromFront_EmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertNull(list.removeFromFront());
    }

    @Test
    void removeFromEnd_EmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertNull(list.removeFromEnd());
    }

    @Test
    void mixedOperations() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
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
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertEquals(0, list.size());
    }

    @Test
    void size_AfterAdditions() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToFront(1);
        assertEquals(1, list.size());
        list.addToEnd(2);
        assertEquals(2, list.size());
        list.addToFront(3);
        assertEquals(3, list.size());
    }

    @Test
    void size_AfterRemovals() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToFront(1);
        list.addToEnd(2);
        list.removeFromFront();
        assertEquals(1, list.size());
        list.removeFromEnd();
        assertEquals(0, list.size());
    }

    @Test
    void isEmpty_EmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    void isEmpty_NonEmptyList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToFront(1);
        assertFalse(list.isEmpty());
    }

    @Test
    void isEmpty_AfterRemovingAll() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addToFront(1);
        list.removeFromFront();
        assertTrue(list.isEmpty());
    }
}
