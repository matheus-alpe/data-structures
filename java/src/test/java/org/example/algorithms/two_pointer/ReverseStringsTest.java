package org.example.algorithms.two_pointer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringsTest {
    @Test
    void testTwoCharacters() {
        assertEquals("ba", ReverseStrings.reverseWords("ab"));
    }

    @Test
    void testSimpleString() {
        assertEquals("olleh", ReverseStrings.reverseWords("hello"));
    }

    @Test
    void testMixedContent() {
        assertEquals("321cba", ReverseStrings.reverseWords("abc123"));
    }

    @Test
    void testPalindrome() {
        assertEquals("aba", ReverseStrings.reverseWords("aba"));
    }

    @Test
    void testCaseOne() {
        assertEquals("rM gniD", ReverseStrings.reverseWords("Mr Ding"));
    }

    @Test
    void testCaseTwo() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseStrings.reverseWords("Let's take LeetCode contest"));
    }
}