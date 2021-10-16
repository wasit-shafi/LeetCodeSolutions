/**
 *  @author WasitShafi
 *  @since  31-JUL-2021
 */

class Solution {
  public int maximumWealth(int[][] accounts) {
    int sum = 0;
    int max = Integer.MIN_VALUE;
    
    
    for (int i = 0; i < accounts.length; i++) {
      sum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        sum += accounts[i][j];
      }
      if (sum > max) {
        max = sum;
      }
    }
      
    return max;
  }
}
