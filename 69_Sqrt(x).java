/**
 *  @author WasitShafi
 *  @since 14-SEP-2020
 */

class Solution {
    public int mySqrt(int x) {
      int i = 1;
  
      if (x < 2) {
        return x;
      }
  
      while ((long)i * i <= x) {
        i++;
      }
      return i - 1;
    }
  }