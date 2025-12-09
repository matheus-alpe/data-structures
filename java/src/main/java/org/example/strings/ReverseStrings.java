package org.example.strings;

public class ReverseStrings {
    // https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
    public static String reverseWords(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();

        while (right <= n) {
            if (right < n && chars[right] != ' ') {
                right++;
            } else {
                int rightPoint = right;
                while (left < rightPoint) {
                    rightPoint--;
                    char tmp = chars[left];
                    chars[left] = chars[rightPoint];
                    chars[rightPoint] = tmp;
                    left++;
                }

                right++;
                left = right;
            }
        }

        return String.valueOf(chars);
    }
}