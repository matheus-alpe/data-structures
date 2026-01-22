package org.example.algorithms.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {

    public HashMap<String, Integer> dijkstra(HashMap<String, HashMap<String, Integer>> graph, String start) {
        HashMap<String, Integer> distances = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> visited = new PriorityQueue<>(Map.Entry.comparingByValue());

        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        visited.add(Map.entry(start, 0));

        while (!visited.isEmpty()) {
            Map.Entry<String, Integer> current = visited.poll();
            String currentNode = current.getKey();
            int currentDist = current.getValue();

            if (currentDist > distances.get(currentNode)) continue;

            for (String neighbor : graph.get(currentNode).keySet()) {
                int newDist = currentDist + graph.get(currentNode).get(neighbor);
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    visited.add(Map.entry(neighbor, newDist));
                }
            }
        }

        return distances;
    }
}
