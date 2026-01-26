package org.example.data_structures.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {
    @Test
    public void testMinHeapInsertionAndExtraction() {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        System.out.println(minHeap);
        assertEquals(1, minHeap.pop());
        assertEquals(3, minHeap.pop());
        assertEquals(5, minHeap.pop());
        assertEquals(8, minHeap.pop());
    }

}