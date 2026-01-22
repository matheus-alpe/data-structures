package org.example.algorithms.graph;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DijkstraTest {

    @Test
    void testDijkstra() {
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        graph.put("A", new HashMap<>(Map.of("B", 1, "C", 4)));
        graph.put("B", new HashMap<>(Map.of("A", 1, "C", 2, "D", 5)));
        graph.put("C", new HashMap<>(Map.of("A", 4, "B", 2, "D", 1)));
        graph.put("D", new HashMap<>(Map.of("B", 5, "C", 1)));
        Dijkstra dijkstra = new Dijkstra();
        HashMap<String, Integer> distances = dijkstra.dijkstra(graph, "A");
        assertEquals(0, distances.get("A"));
        assertEquals(1, distances.get("B"));
        assertEquals(3, distances.get("C"));
        assertEquals(4, distances.get("D"));
    }
}