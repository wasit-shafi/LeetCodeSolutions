/**
 *  @author WasitShafi
 *  @since 15-SEP-2020
 */

class Solution {
    public int mySqrt(int x) {
      int low = 1;
      int high = x/2;
      int mid;
      Long sqrt;
      int floorValue = x;
      
      while (low <= high) {
        mid = low + (high - low) / 2;
        sqrt = (long)mid * mid;
        if (sqrt == x) {
          return mid;
        } else if (sqrt < x) {
          floorValue = mid;
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
      return floorValue;
    }
  }