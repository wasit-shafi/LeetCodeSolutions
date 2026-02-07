/**
 * @author WasitShafi
 * @since 07-FEB-2026
 */
// I am following the Greedy Approach:
// buy when next price is increasing, sell when next price is decreasing
// CTM: This question was given to me ZippMat CTO, Vishal for Sr. SDE role

class Solution {
  public int maxProfit(int[] prices) {
    int currentProfit;
    int totalProfit = 0;
    int lastPurchasedStockPrice = 0;
    boolean hasPurchasedStock = false;

    for (int i = 0; i < prices.length - 1; i++) {
      if (!hasPurchasedStock && prices[i] < prices[i + 1]) {
        hasPurchasedStock = true; // buy stock
        lastPurchasedStockPrice = prices[i];
      } else if (hasPurchasedStock && prices[i] > prices[i + 1]) {
        currentProfit = prices[i] - lastPurchasedStockPrice;

        if (currentProfit > 0) {
          hasPurchasedStock = false; // sell stock
          totalProfit += currentProfit;
        }
      }
    }

    if (hasPurchasedStock && prices[prices.length - 1] > lastPurchasedStockPrice) {
      totalProfit += prices[prices.length - 1] - lastPurchasedStockPrice;
    }

    return totalProfit;
  }
}