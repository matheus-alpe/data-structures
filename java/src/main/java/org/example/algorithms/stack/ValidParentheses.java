package org.example.algorithms.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    // https://leetcode.com/problems/valid-parentheses/description/
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        for (char currentChar : s.toCharArray()) {
            if (map.containsKey(currentChar)) {
                if (stack.isEmpty() || stack.pop() != map.get(currentChar)) {
                    return false;
                }
            } else {
                stack.push(currentChar);
            }
        }

        return stack.isEmpty();
    }

    public boolean isValidOptimal(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack[head++] = ')';
                    break;
                case '{':
                    stack[head++] = '}';
                    break;
                case '[':
                    stack[head++] = ']';
                    break;
                default:
                    if (head == 0 || stack[--head] != c) return false;
            }
        }
        return head == 0;
    }
}
