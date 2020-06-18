package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class length_Of_LastWord_58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        if(s.length() == 1){
            if (s.charAt(0) != ' ') {
                return 1;
            } else {
                return 0;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    @Test
    public void exam1() {
        assertEquals(lengthOfLastWord("a "), 1);
    }
}
