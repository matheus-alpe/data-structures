package org.example.algorithms.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphCourseSchedule {
    // https://leetcode.com/problems/course-schedule/
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] pre : prerequisites) {
            graph.putIfAbsent(pre[0], new ArrayList<>());
            graph.get(pre[0]).add(pre[1]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        for (int course = 0; course < numCourses; course++) {
            if (isCyclic(course, graph, visited, recStack)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCyclic(int course, HashMap<Integer, List<Integer>> graph, boolean[] visited, boolean[] recStack) {
        if (recStack[course]) return true;
        if (visited[course]) return false;

        visited[course] = true;
        recStack[course] = true;

        List<Integer> neighbors = graph.get(course);
        if (neighbors != null) {
            for (int neighbor : neighbors) {
                if (isCyclic(neighbor, graph, visited, recStack)) {
                    return true;
                }
            }
        }

        recStack[course] = false;
        return false;
    }
}
