/**
 *  @author WasitShafi
 *  @since 01-SEP-2020
 */

class Solution {
  public int minCostClimbingStairs(int[] cost) {
    int min;
    int min1 = cost[0];
    int min2 = cost[1];
    int length = cost.length;
      
    for (int i = 2; i < length; i++) {
      min = cost[i] + (min1 < min2 ? min1 : min2);
      min1 = min2;
      min2 = min;
    }
    return min1 < min2 ? min1 : min2;
  }
}