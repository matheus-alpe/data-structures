package org.example.algorithms.exponential_search;

import org.example.algorithms.binary_search.BinarySearch;

public class ExponentialSearch {
    public static int exponentialSearch(int[] numbers, int target) {
        if (numbers[0] == target) return 0;

        int i = 1;
        int n = numbers.length;

        while (i < n && numbers[i] < target) {
            i *= 2;
        }

        if (numbers[i] == target) return i;

        return BinarySearch.binarySearch(
                numbers,
                target,
                i / 2,
                Math.min(i, n - 1)
        );
    }
}
