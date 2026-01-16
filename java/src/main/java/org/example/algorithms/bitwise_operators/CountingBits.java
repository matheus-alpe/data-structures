package org.example.algorithms.bitwise_operators;

public class CountingBits {
    // https://leetcode.com/problems/counting-bits/description/
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
