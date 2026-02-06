
/**
 * @author WasitShafi
 * @since 07-FEB-2026
 */

class Solution {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int currentProfit;
    int[] maxSellingPrice = new int[prices.length];

    for (int i = prices.length - 1; i >= 0; i--) {
      maxSellingPrice[i] = i == prices.length - 1 || prices[i] > maxSellingPrice[i + 1] ? prices[i]
          : maxSellingPrice[i + 1];
    }

    for (int i = 0; i < prices.length; i++) {
      currentProfit = maxSellingPrice[i] - prices[i];

      if (currentProfit > maxProfit) {
        maxProfit = currentProfit;
      }
    }

    return maxProfit;
  }
}