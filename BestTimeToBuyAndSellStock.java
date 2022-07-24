/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int profit = 0;
        int buy_index = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < buy) {
                buy = prices[i];
                buy_index = i;
            }

            if (profit < prices[i] - buy && i > buy_index) {
                sell = prices[i];
                profit = sell - buy;
            }

        }
        if (profit > 0) {
            return profit;
        } else {
            return 0;
        }

    }
}
// @lc code=end
