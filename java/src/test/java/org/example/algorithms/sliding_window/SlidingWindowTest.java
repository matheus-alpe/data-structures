package org.example.algorithms.sliding_window;


import org.example.algorithms.algorithms.sliding_window.SlidingWindow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlidingWindowTest {

    @Test
    void testCase1() {
        String input = "bcbbbcba";
        assertEquals(4, SlidingWindow.maximumLengthSubstring(input));
    }

    @Test
    void testCase2() {
        String input = "aaaa";
        assertEquals(2, SlidingWindow.maximumLengthSubstring(input));
    }
}