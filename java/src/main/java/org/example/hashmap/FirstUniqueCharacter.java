package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    // https://leetcode.com/problems/first-unique-character-in-a-string/description/
    public static int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }


        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (mp.get(ch) == 1) return i;
        }

        return -1;
    }

    public static int firstUniqCharFastest(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
