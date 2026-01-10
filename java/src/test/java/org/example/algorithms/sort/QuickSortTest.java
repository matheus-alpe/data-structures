package org.example.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {
    @Test
    void case1() {
        int[] nums = {5, 4, 3, 2, 1};
        QuickSort.sort(nums, 0, nums.length - 1);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(4, nums[3]);
        assertEquals(5, nums[4]);
    }

    @Test
    void case2() {
        int[] nums = {1, 2, 3, 4, 5};
        QuickSort.sort(nums, 0, nums.length - 1);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(4, nums[3]);
        assertEquals(5, nums[4]);
    }

    @Test
    void case3() {
        int[] nums = {1, 2, 5, 4, 3};
        QuickSort.sort(nums, 0, nums.length - 1);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(4, nums[3]);
        assertEquals(5, nums[4]);
    }
}