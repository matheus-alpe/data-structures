package org.example.algorithms.bitwise_operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsTest {

    @Test
    void testNumberOfSteps() {
        NumberOfSteps numberOfSteps = new NumberOfSteps();

        assertEquals(0, numberOfSteps.numberOfSteps(0));
        assertEquals(4, numberOfSteps.numberOfSteps(8));
        assertEquals(6, numberOfSteps.numberOfSteps(14));
        assertEquals(12, numberOfSteps.numberOfSteps(123));
    }
}