package org.example.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    @Test
    void testCase1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertEquals(true, ContainsDuplicate.containsNearbyDuplicate(nums, k));
    }

    @Test
    void testCase2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        assertEquals(true, ContainsDuplicate.containsNearbyDuplicate(nums, k));
    }

    @Test
    void testCase3() {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        assertEquals(false, ContainsDuplicate.containsNearbyDuplicate(nums, k));
    }

    @Test
    void testCase4() {
        int[] nums = {1,2,3,4,5,6,7,8,9,9};
        int k = 3;
        assertEquals(true, ContainsDuplicate.containsNearbyDuplicate(nums, k));
    }
}