package org.example.algorithms.bitwise_operators;

public class MissingNumber {
    // https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] nums) {
        int x = nums.length;

        for (int i = 0; i < nums.length; i++) {
            x ^= i;
            x ^= nums[i];
        }

        return x;
    }
}
