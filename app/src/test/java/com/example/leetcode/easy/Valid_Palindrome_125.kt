package com.example.leetcode.easy

import org.junit.Test

class Valid_Palindrome_125 {
    @Test
    fun isPalindrome(s: String): Boolean {
        val str = s.replace("[^a-zA-Z0-9]".toRegex(), "")
        val reverseStr = str.reversed()
        return str.equals(reverseStr, ignoreCase = true)
    }

    @Test
    fun isPalindromeBest(s: String): Boolean {
        var i =0
        var j = s.length-1
        while(i<=j){
            if(!Character.isLetter(s[i]) && !Character.isDigit(s[i])){
                i++
                continue
            }

            if(!Character.isLetter(s[j]) &&  !Character.isDigit(s[j])){
                j--
                continue
            }

            if(s[i].toLowerCase() != s[j].toLowerCase()){
                return false
            }
            i++
            j--
        }
        return true
    }
}