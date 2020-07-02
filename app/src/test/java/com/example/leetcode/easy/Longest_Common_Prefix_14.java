package com.example.leetcode;

import org.junit.Test;

public class Longest_Common_Prefix_14 {
    @Test
    public String longestCommonPrefix(String[] strs) {
        if (strs.length > 0) {
            String temp = strs[0];
            int same = temp.length();
            for (int i = 1; i < strs.length; i++) {
                char[] temp2 = strs[i].toCharArray();
                if (same > 0) {
                    if (same > temp2.length) {
                        same = temp2.length;
                    }
                    for (int j = 0; j < same; j++) {
                        if (temp.charAt(j) != temp2[j]) {
                            same = j;
                            break;
                        }
                    }
                }
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < same; i++) {
                result.append(temp.charAt(i));
            }
            return result.toString();
        } else {
            return "";
        }
    }

    @Test
    public String longestCommonPrefix_BestSolution(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}

