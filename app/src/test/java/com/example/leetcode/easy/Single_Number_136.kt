package com.example.leetcode.easy

import org.junit.Assert
import org.junit.Test


class SingleNumber136 {

    private fun singleNumber(nums: IntArray): Int {
        val capitalCities: HashMap<Int, Int> =
            HashMap()
        for (i in nums.indices) {
            val k = capitalCities[nums[i]]
            if (k != null) {
                capitalCities[nums[i]] = k + 1
            } else {
                capitalCities[nums[i]] = 1
            }
        }
        for (i in capitalCities.entries){
            if(i.value == 1){
                return i.key
            }
        }
        return 0
    }

    private fun singleNumberBest(nums: IntArray): Int {
        if (nums.size == 1) {
            return nums[0]
        }
        var num = 0
        for (x in nums) {
            num = num xor x
        }
        return num
    }

    @Test
    fun testSingleNumber(){
        Assert.assertEquals(4, singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    }

}