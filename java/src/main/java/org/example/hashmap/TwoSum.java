package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> calc = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (calc.containsKey(diff)) {
                int value = calc.get(diff);
                result = new int[]{value, i};
                break;
            }

            calc.put(nums[i], i);
        }

        return result;
    }
}
