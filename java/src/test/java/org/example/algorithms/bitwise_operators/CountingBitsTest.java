package org.example.algorithms.bitwise_operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {
    @Test
    void testCountBits() {
        CountingBits countingBits = new CountingBits();

        assertArrayEquals(new int[]{0}, countingBits.countBits(0));
        assertArrayEquals(new int[]{0, 1, 1}, countingBits.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countingBits.countBits(5));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}, countingBits.countBits(8));
    }

}