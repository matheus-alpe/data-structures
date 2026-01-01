package org.example.algorithms.algorithms.binary_search;

public class BinarySearch {
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length;

        while (left < right) {
            int mid = (left + right) >>> 1;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[mid] < target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] numbers, int target, int left, int right) {
        while (left < right) {
            int mid = (left + right) >>> 1;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[mid] < target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
