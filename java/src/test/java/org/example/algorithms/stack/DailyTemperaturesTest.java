package org.example.algorithms.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {
    @Test
    void testDailyTemperatures() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();

        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected1 = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected1, dailyTemperatures.dailyTemperatures(temperatures1));

        int[] temperatures2 = {30, 40, 50, 60};
        int[] expected2 = {1, 1, 1, 0};
        assertArrayEquals(expected2, dailyTemperatures.dailyTemperatures(temperatures2));

        int[] temperatures3 = {30, 60, 90};
        int[] expected3 = {1, 1, 0};
        assertArrayEquals(expected3, dailyTemperatures.dailyTemperatures(temperatures3));
    }

}