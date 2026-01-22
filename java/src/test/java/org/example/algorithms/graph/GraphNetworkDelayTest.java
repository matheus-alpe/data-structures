package org.example.algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphNetworkDelayTest {
    @Test
    public void testNetworkDelayTime() {
        GraphNetworkDelay gnd = new GraphNetworkDelay();
        int[][] times1 = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(2, gnd.networkDelayTime(times1, 4, 2));

        int[][] times2 = {{1, 2, 1}};
        assertEquals(1, gnd.networkDelayTime(times2, 2, 1));

        int[][] times3 = {{1, 2, 1}};
        assertEquals(-1, gnd.networkDelayTime(times3, 2, 2));

        int[][] times4 = {{1, 2, 1}, {2, 3, 2}, {1, 3, 4}};
        assertEquals(3, gnd.networkDelayTime(times4, 3, 1));
    }

    @Test
    public void testNetworkDelayTimePerformance() {
        GraphNetworkDelay gnd = new GraphNetworkDelay();
        int[][] times1 = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(2, gnd.networkDelayTimePerformance(times1, 4, 2));

        int[][] times2 = {{1, 2, 1}};
        assertEquals(1, gnd.networkDelayTimePerformance(times2, 2, 1));

        int[][] times3 = {{1, 2, 1}};
        assertEquals(-1, gnd.networkDelayTimePerformance(times3, 2, 2));

        int[][] times4 = {{1, 2, 1}, {2, 3, 2}, {1, 3, 4}};
        assertEquals(3, gnd.networkDelayTimePerformance(times4, 3, 1));
    }
}