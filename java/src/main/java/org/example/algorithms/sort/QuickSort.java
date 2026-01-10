package org.example.algorithms.sort;

/**
 * - Time Complexity:   O(N^2)
 * - Space Complexity:  O(N)
 */
public class QuickSort {
    public static void sort(int[] nums, int left, int right) {

        if (left < right) {
            int pivot = partition(nums, left, right);
            sort(nums, left, pivot - 1);
            sort(nums, pivot + 1, right);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }

        }

        swap(nums, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] nums, int indexA, int indexB) {
        int tmp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = tmp;
    }
}
