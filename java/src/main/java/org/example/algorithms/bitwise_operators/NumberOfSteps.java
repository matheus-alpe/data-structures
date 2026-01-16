package org.example.algorithms.bitwise_operators;

public class NumberOfSteps {
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1; // Divide by 2
            } else {
                num ^= 1; // Subtract 1
            }
            steps++;
        }
        return steps;
    }
}
