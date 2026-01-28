package org.example.data_structures.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {
    @Test
    public void testTopKFrequent() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] expected = {1,2};
        int[] result = topKFrequentElements.topKFrequent(nums, k);
        assertArrayEquals(expected, result);
    }
}