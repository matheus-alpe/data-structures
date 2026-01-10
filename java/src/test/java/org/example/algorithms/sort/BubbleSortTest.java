package org.example.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void case1() {
        int[] nums = {5, 4, 3, 2, 1};
        BubbleSort.Result result = BubbleSort.sort(nums);
        assertEquals(1, result.nums()[0]);
        assertEquals(2, result.nums()[1]);
        assertEquals(3, result.nums()[2]);
        assertEquals(4, result.nums()[3]);
        assertEquals(5, result.nums()[4]);
        assertEquals(5, result.iteractions());
    }

    @Test
    void case2() {
        int[] nums = {1, 2, 3, 4, 5};
        BubbleSort.Result result = BubbleSort.sort(nums);
        assertEquals(1, result.nums()[0]);
        assertEquals(2, result.nums()[1]);
        assertEquals(3, result.nums()[2]);
        assertEquals(4, result.nums()[3]);
        assertEquals(5, result.nums()[4]);
        assertEquals(1, result.iteractions());
    }

    @Test
    void case3() {
        int[] nums = {1, 2, 5, 4, 3};
        BubbleSort.Result result = BubbleSort.sort(nums);
        assertEquals(1, result.nums()[0]);
        assertEquals(2, result.nums()[1]);
        assertEquals(3, result.nums()[2]);
        assertEquals(4, result.nums()[3]);
        assertEquals(5, result.nums()[4]);
        assertEquals(3, result.iteractions());
    }
}