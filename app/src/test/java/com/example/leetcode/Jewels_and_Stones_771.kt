package com.example.leetcode

import org.junit.Test
import org.junit.Assert.*


class TestLeetCode {

    @Test
    fun numJewelsInStones(J: String, S: String): Int {
        if(J.isEmpty() || S.isEmpty()) return 0

        val jewel = BooleanArray(128)
        for (c in J.toCharArray())
            jewel[c.toInt()] = true

        var res = 0
        for (c in S.toCharArray()) {
            if (jewel[c.toInt()]) ++res
        }

        return res
    }
}