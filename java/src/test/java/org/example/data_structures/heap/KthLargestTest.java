package org.example.data_structures.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {
    @Test
    public void testKthLargest() {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4, kthLargest.add(3));  // returns 4
        assertEquals(5, kthLargest.add(5));  // returns 5
        assertEquals(5, kthLargest.add(10)); // returns 5
        assertEquals(8, kthLargest.add(9));  // returns 8
        assertEquals(8, kthLargest.add(4));  // returns 8
    }
}