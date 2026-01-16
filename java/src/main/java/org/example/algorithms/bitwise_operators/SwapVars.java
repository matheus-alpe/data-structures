package org.example.algorithms.bitwise_operators;

public class SwapVars {
    // Swap two variables without using a temporary variable
    public void swap(int[] nums) {
        if (nums.length != 2) {
            throw new IllegalArgumentException("Array must contain exactly two elements.");
        }

        nums[0] ^= nums[1];
        nums[1] ^= nums[0];
        nums[0] ^= nums[1];
    }
}
