package org.example.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DutchNationalFlagSortTest {
    @Test
    void case1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        DutchNationalFlagSort.sort(nums);
        assertEquals(0, nums[0]);
        assertEquals(0, nums[1]);
        assertEquals(1, nums[2]);
        assertEquals(1, nums[3]);
        assertEquals(2, nums[4]);
        assertEquals(2, nums[4]);
    }

    @Test
    void case2() {
        int[] nums = {2, 0, 1};
        DutchNationalFlagSort.sort(nums);
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
    }
}