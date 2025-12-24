package org.example.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    // https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/
    public static int maximumLengthSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 1;
        Map<Character, Integer> counter = new HashMap<>();
        counter.put(s.charAt(0), 1);

        while (right < s.length() - 1) {
            right++;
            char currentRightChar = s.charAt(right);

            counter.compute(currentRightChar, (key, value) -> value == null ? 1 : ++value);

            while (counter.get(currentRightChar) == 3) {
                char currentLeftChar = s.charAt(left);
                counter.compute(currentLeftChar, (key, value) -> value == null ? 1 : --value);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static int maximumLengthSubstringBetterPerformance(String s) {
        int left = 0;
        int max = 0;
        int[] frequency = new int[26];

        for (int right = 0; right < s.length(); right++) {
            frequency[s.charAt(right) - 'a']++;

            while(frequency[s.charAt(right) - 'a'] > 2) {
                frequency[s.charAt(left) - 'a']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
