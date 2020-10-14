package com.example.leetcode.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

class IsomorphicStrings205 {
    fun isIsomorphic(s: String, t: String): Boolean {
        val m1 = IntArray(256)
        val m2 = IntArray(256)
        val n: Int = s.length
        for (i in 0 until n) {
            if (m1[s[i].toInt()] != m2[t[i].toInt()]) return false
            m1[s[i].toInt()] = i + 1
            m2[t[i].toInt()] = i + 1
        }
        return true
    }

    @Test
    fun testisIsomorphic() {
        assertEquals(true, isIsomorphic("paper", "title"))
        assertEquals(true, isIsomorphic("add", "egg"))
        assertEquals(false, isIsomorphic("foo", "bar"))
    }
}