package com.example.leetcode.easy

class BestTimeToBuyAndSellStock2_122 {

    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var index = 0

        if (prices.isEmpty() || prices.size == 1) {
            return 0
        } else {
            var start = prices[0]
            for (i in prices.indices) {
                if (prices[i] > start && i > index) {
                    val temp = prices[i] - start
                    result += temp
                    start = prices[i]
                    index = i
                }
                if (prices[i] < start && i > index) {
                    start = prices[i]
                    index = i
                }
            }
        }
        return result
    }
}