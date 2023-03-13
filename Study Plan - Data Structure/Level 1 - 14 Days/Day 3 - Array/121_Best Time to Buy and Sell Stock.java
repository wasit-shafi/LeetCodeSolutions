/**
 * @author WasitShafi
 * @since 28-NOV-2022
 */
// Question:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=data-structure-i

class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    int maxProfit = 0;
    int[] maxPricesAfterToday = new int[prices.length];

    maxPricesAfterToday[prices.length - 1] = prices[prices.length - 1];
    for (int i = prices.length - 1; i > 0; i--) {
      if (prices[i - 1] > maxPricesAfterToday[i]) {
        maxPricesAfterToday[i - 1] = prices[i - 1];
      } else {
        maxPricesAfterToday[i - 1] = maxPricesAfterToday[i];
      }
    }

    // now calculate the max profit
    for (int i = 0; i < prices.length; i++) {
      profit = maxPricesAfterToday[i] - prices[i];
      if (profit > maxProfit) {
        maxProfit = profit;
      }
    }
    return maxProfit;
  }
}