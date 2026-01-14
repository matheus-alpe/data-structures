package org.example.algorithms.sort;

import java.util.TreeMap;

public class RelativeSortArray {
    // https://leetcode.com/problems/relative-sort-array/
    public static int[] sort(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int n : arr1) count[n]++;

        int i = 0;
        for(int n : arr2) {
            while(count[n]-- > 0) {
                arr1[i++] = n;
            }
        }

        for(int n = 0; n < count.length; n++) {
            while(count[n]-- > 0) {
                arr1[i++] = n;
            }
        }

        return arr1;
    }

    public static int[] sortWithMap(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : arr1) map.put(n, map.getOrDefault(n, 0) + 1);

        int i = 0;
        for(int n : arr2) {
            for (int c = map.get(n); c > 0; c--) {
                arr1[i++] = n;
            }
            map.remove(n);
        }

        for(int n : map.keySet()) {
            for (int c = map.get(n); c > 0; c--) {
                arr1[i++] = n;
            }
        }

        return arr1;
    }
}
