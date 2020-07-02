package com.example.leetcode;

import org.junit.Test;

import java.util.Stack;

public class Valid_Parentheses_20 {
    @Test
    public boolean isValid(String source) {
        Stack<Character> stack = new Stack<>();
        for (char c : source.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
