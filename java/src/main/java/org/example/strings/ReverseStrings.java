package org.example.strings;

public class ReverseStrings {
    // https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();

        for (int left = 0, right = 0; right <= chars.length; right++) {
            if (right == chars.length || chars[right] == ' ') {
                reverse(chars, left, right - 1);
                left = right + 1;
            }
        }

        return String.valueOf(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char tmp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = tmp;
        }
    }
}