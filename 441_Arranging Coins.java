/**
 *  @author WasitShafi
 *  @since 19-OCT-2020
 */

class Solution {
  public int arrangeCoins(int n) {
    if (n < 2) {
      return n;
    }
    int i = 1;s
    long sum = 0;
    
    for (i = 1; sum + i <= n; i++) {
      sum += i;
    }
    return (int)i - 1;
  }
}