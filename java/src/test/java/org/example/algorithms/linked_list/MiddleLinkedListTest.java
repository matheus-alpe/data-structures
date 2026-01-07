package org.example.algorithms.linked_list;

import org.example.data_structures.linked_list.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleLinkedListTest {

    @Test
    void case1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1).add(2).add(3).add(4).add(5);

        SinglyLinkedList<Integer> result = MiddleLinkedList.middleNode(list);
        assertEquals(3, result.value);
        assertEquals(4, result.next.value);
        assertEquals(5, result.next.next.value);
    }

    @Test
    void case2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1).add(2).add(3).add(4).add(5).add(6);

        SinglyLinkedList<Integer> result = MiddleLinkedList.middleNode(list);
        assertEquals(4, result.value);
        assertEquals(5, result.next.value);
        assertEquals(6, result.next.next.value);
    }
}
