package org.example.algorithms.bitwise_operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {
    @Test
    void testMissingNumber() {
        MissingNumber missingNumber = new MissingNumber();

        assertEquals(2, missingNumber.missingNumber(new int[]{3, 0, 1}));
        assertEquals(2, missingNumber.missingNumber(new int[]{0, 1}));
        assertEquals(8, missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, missingNumber.missingNumber(new int[]{0}));
    }
}