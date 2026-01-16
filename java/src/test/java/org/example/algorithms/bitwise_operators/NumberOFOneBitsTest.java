package org.example.algorithms.bitwise_operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOFOneBitsTest {

    @Test
    void testHammingWeight() {
        NumberOFOneBits numberOFOneBits = new NumberOFOneBits();

        assertEquals(0, numberOFOneBits.hammingWeight(0));
        assertEquals(1, numberOFOneBits.hammingWeight(1));
        assertEquals(3, numberOFOneBits.hammingWeight(11));
        assertEquals(1, numberOFOneBits.hammingWeight(128));
        assertEquals(30, numberOFOneBits.hammingWeight(2147483645));
    }
}