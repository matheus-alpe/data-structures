package org.example.sliding_window;

public class ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int max = nums.length - 1;

        while (right < max) {
            right++;
            int diff = Math.abs(left - right);
            if (nums[left] == nums[right] && diff <= k) return true;

            if (diff >= k || right == max) {
                right = ++left;
            }
        }

        return false;
    }
}
