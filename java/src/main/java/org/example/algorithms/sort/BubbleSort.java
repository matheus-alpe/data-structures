package org.example.algorithms.sort;

import java.util.Arrays;

/**
 * - Time Complexity:   O(N^2)
 * - Space Complexity:  O(1)
 */
public class BubbleSort {
    public static Result bubble(int[] nums) {
        int size = nums.length;
        int iteractions = 0;

        for (int i = 0; i < size; i++) {
            iteractions++;
            boolean isSorted = true;
            System.out.println(Arrays.toString(nums));
            
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    isSorted = false;
                    int tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
            if (isSorted) {
                return new Result(nums, iteractions);
            }
        }

        return new Result(nums, iteractions);
    }

    public record Result(int[] nums, int iteractions) {
    }
}
