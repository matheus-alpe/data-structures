package org.example.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void test5() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expectedIndex = 2;
        assertEquals(expectedIndex, BinarySearch.binarySearch(numbers, 3));
    }

    @Test
    void test10() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedIndex = 2;
        assertEquals(expectedIndex, BinarySearch.binarySearch(numbers, 3));
    }

    @Test
    void test40() {
        int[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40
        };
        int expectedIndex = 2;
        assertEquals(expectedIndex, BinarySearch.binarySearch(numbers, 3));
    }
}