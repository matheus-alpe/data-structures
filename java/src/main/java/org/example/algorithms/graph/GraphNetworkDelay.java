package org.example.algorithms.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class GraphNetworkDelay {
    // https://leetcode.com/problems/network-delay-time/
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, HashMap<Integer, Integer>> graph = new HashMap<>();

        for (int[] time : times) {
            graph.putIfAbsent(time[0], new HashMap<>());
            graph.get(time[0]).put(time[1], time[2]);
        }

        var distances = dijkstra(graph, k);
        int maxDelay = 0;
        for (int dist : distances.values()) {
            maxDelay = Math.max(maxDelay, dist);
        }
        if (distances.size() < n || maxDelay == 0) return -1;
        return maxDelay;
    }

    public HashMap<Integer, Integer> dijkstra(HashMap<Integer, HashMap<Integer, Integer>> graph, int start) {
        HashMap<Integer, Integer> distances = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> visited = new PriorityQueue<>(Map.Entry.comparingByValue());

        distances.put(start, 0);
        visited.add(Map.entry(start, 0));

        while (!visited.isEmpty()) {
            Map.Entry<Integer, Integer> current = visited.poll();
            int currentNode = current.getKey();
            int currentDist = current.getValue();

            if (graph.get(currentNode) == null || currentDist > distances.get(currentNode)) continue;

            for (int neighbor : graph.get(currentNode).keySet()) {
                int newDist = currentDist + graph.get(currentNode).get(neighbor);
                if (newDist < distances.getOrDefault(neighbor, Integer.MAX_VALUE)) {
                    distances.put(neighbor, newDist);
                    visited.add(Map.entry(neighbor, newDist));
                }
            }
        }

        return distances;
    }

    public int networkDelayTimePerformance(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] t : times) adj.get(t[0]).add(new int[]{t[1], t[2]});

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        heap.offer(new int[]{k,0});

        int[] mins = new int[n + 1];
        Arrays.fill(mins, Integer.MAX_VALUE);
        mins[k] = 0;

        while (!heap.isEmpty()) {
            int[] state = heap.poll();
            int curr = state[0];
            int weight = state[1];
            if (weight > mins[curr]) continue;

            for (int[] nei : adj.get(curr)) {
                int next = nei[0];
                int nw = nei[1] + weight;
                if (mins[next] > nw) {
                    mins[next] = nw;
                    heap.offer(new int[]{next, nw});
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) ans = Math.max(ans, mins[i]);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
