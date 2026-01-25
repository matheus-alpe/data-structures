package org.example.algorithms.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    @Test
    public void test() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("()"));
        assertTrue(vp.isValid("()[]{}"));
        assertFalse(vp.isValid("(]"));
        assertFalse(vp.isValid("([)]"));
        assertTrue(vp.isValid("{[]}"));
        assertFalse(vp.isValid("["));
    }

    @Test
    public void testTwoPointer() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValidOptimal("()"));
        assertTrue(vp.isValidOptimal("()[]{}"));
        assertFalse(vp.isValidOptimal("(]"));
        assertFalse(vp.isValidOptimal("([)]"));
        assertTrue(vp.isValidOptimal("{[]}"));
        assertFalse(vp.isValidOptimal("["));
    }
}