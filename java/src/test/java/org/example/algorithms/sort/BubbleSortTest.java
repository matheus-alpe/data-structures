package org.example.algorithms.sort;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void case1() {
        int[] nums = {5, 4, 3, 2, 1};
        BubbleSort.Result result = BubbleSort.sort(nums);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result.nums());
        assertEquals(5, result.iteractions());
    }

    @Test
    void case2() {
        int[] nums = {1, 2, 3, 4, 5};
        BubbleSort.Result result = BubbleSort.sort(nums);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result.nums());
        assertEquals(1, result.iteractions());
    }

    @Test
    void case3() {
        int[] nums = {1, 2, 5, 4, 3};
        BubbleSort.Result result = BubbleSort.sort(nums);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result.nums());
        assertEquals(3, result.iteractions());
    }
}