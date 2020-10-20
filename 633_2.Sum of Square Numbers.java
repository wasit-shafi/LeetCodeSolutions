/**
 *  @author WasitShafi
 *  @since 10-OCT-2020
 */

class Solution {
  public boolean judgeSquareSum(int c) {
    int num;
    int low = 0;
    int high = (int)Math.sqrt(c);
    
    while (low <= high) {
      num = low * low + high * high;
      
      if (num == c) {
        return true;
      } else if (num < c) {
        low++;
      } else {
        high--;
      }
    }
    return false;
  }
}