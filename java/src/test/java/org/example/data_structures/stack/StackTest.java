package org.example.data_structures.stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void testPushAndPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeek() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size());
        assertEquals(20, stack.peek());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.peek());
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    void testPopEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(EmptyStackException.class, stack::pop);
        assertThrows(EmptyStackException.class, stack::peek);
    }
}