package org.example.algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphCourseScheduleTest {
    @Test
    public void testCanFinish() {
        GraphCourseSchedule gcs = new GraphCourseSchedule();

        int[][] prerequisites1 = {{1,0},{0,1}};
        assertFalse(gcs.canFinish(2, prerequisites1));

        int[][] prerequisites2 = {{1,0},{2,1},{3,2}};
        assertTrue(gcs.canFinish(4, prerequisites2));

        int[][] prerequisites3 = {{0,1},{1,2},{2,0}};
        assertFalse(gcs.canFinish(3, prerequisites3));

        int[][] prerequisites4 = {};
        assertTrue(gcs.canFinish(5, prerequisites4));
    }
}