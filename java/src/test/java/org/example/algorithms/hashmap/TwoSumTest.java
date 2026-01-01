package org.example.algorithms.hashmap;

import org.example.algorithms.algorithms.hashmap.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    @Test
    void testCase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void testCase2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void testCase3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}