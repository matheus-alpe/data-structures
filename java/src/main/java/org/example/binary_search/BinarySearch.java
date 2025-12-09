package org.example.binary_search;

public class BinarySearch {
    public static int binarySearch(int[] numbers, int n) {
        int low = 0;
        int high = numbers.length;

        while (low < high) {
            int mid = (low + high) >>> 1;

            if (numbers[mid] == n) {
                return mid;
            }

            if (numbers[mid] < n) {
                low = mid+1;
            } else {
                high = mid;
            }
        }

        return -1;
    }
}
