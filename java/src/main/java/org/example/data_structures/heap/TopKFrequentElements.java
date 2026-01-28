package org.example.data_structures.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    // https://leetcode.com/problems/top-k-frequent-elements/description/
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(countMap::get));
        for (int num : countMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] frequency = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            if (minHeap.isEmpty()) break;
            frequency[i] = minHeap.poll();
        }

        return frequency;
    }
}
