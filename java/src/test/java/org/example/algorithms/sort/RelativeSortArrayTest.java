package org.example.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RelativeSortArrayTest {
    @Test
    void case1() {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] answer = RelativeSortArray.sort(arr1, arr2);
        assertEquals(2, answer[0]);
        assertEquals(2, answer[1]);
        assertEquals(2, answer[2]);
        assertEquals(1, answer[3]);
        assertEquals(4, answer[4]);
        assertEquals(3, answer[5]);
        assertEquals(3, answer[6]);
        assertEquals(9, answer[7]);
        assertEquals(6, answer[8]);
        assertEquals(7, answer[9]);
        assertEquals(19, answer[10]);
    }

    @Test
    void case2() {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        int[] answer = RelativeSortArray.sort(arr1, arr2);
        assertEquals(22, answer[0]);
        assertEquals(28, answer[1]);
        assertEquals(8, answer[2]);
        assertEquals(6, answer[3]);
        assertEquals(17, answer[4]);
        assertEquals(44, answer[5]);
    }

    @Test
    void case1_map() {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] answer = RelativeSortArray.sortWithMap(arr1, arr2);
        assertEquals(2, answer[0]);
        assertEquals(2, answer[1]);
        assertEquals(2, answer[2]);
        assertEquals(1, answer[3]);
        assertEquals(4, answer[4]);
        assertEquals(3, answer[5]);
        assertEquals(3, answer[6]);
        assertEquals(9, answer[7]);
        assertEquals(6, answer[8]);
        assertEquals(7, answer[9]);
        assertEquals(19, answer[10]);
    }

    @Test
    void case2_map() {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        int[] answer = RelativeSortArray.sortWithMap(arr1, arr2);
        assertEquals(22, answer[0]);
        assertEquals(28, answer[1]);
        assertEquals(8, answer[2]);
        assertEquals(6, answer[3]);
        assertEquals(17, answer[4]);
        assertEquals(44, answer[5]);
    }
}