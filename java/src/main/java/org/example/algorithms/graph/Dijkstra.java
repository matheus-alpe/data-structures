package org.example.algorithms.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dijkstra {

    public HashMap<String, Integer> dijkstra(HashMap<String, HashMap<String, Integer>> graph, String start) {
        HashMap<String, Integer> distances = new HashMap<>();
        List<String> visited = new ArrayList<>();

        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        while (visited.size() < graph.size()) {
            String currentNode = getClosestNode(distances, visited);
            visited.add(currentNode);

            for (String neighbor : graph.get(currentNode).keySet()) {
                if (!visited.contains(neighbor)) {
                    int newDist = distances.get(currentNode) + graph.get(currentNode).get(neighbor);
                    if (newDist < distances.get(neighbor)) {
                        distances.put(neighbor, newDist);
                    }
                }
            }
        }

        return distances;
    }

    private String getClosestNode(HashMap<String, Integer> distances, List<String> visited) {
        String closestNode = null;
        int closestDistance = Integer.MAX_VALUE;

        for (String node : distances.keySet()) {
            if (!visited.contains(node) && distances.get(node) < closestDistance) {
                closestDistance = distances.get(node);
                closestNode = node;
            }
        }

        return closestNode;
    }
}
