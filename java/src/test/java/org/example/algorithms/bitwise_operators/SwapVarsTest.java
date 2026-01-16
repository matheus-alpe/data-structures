package org.example.algorithms.bitwise_operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapVarsTest {
    @Test
    void testSwap() {
        SwapVars swapVars = new SwapVars();

        int[] nums1 = {5, 10};
        swapVars.swap(nums1);
        assertArrayEquals(new int[]{10, 5}, nums1);

        int[] nums2 = {-1, 1};
        swapVars.swap(nums2);
        assertArrayEquals(new int[]{1, -1}, nums2);

        int[] nums3 = {0, 0};
        swapVars.swap(nums3);
        assertArrayEquals(new int[]{0, 0}, nums3);
    }

}