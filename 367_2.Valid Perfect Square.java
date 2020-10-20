/**
 *  @author WasitShafi
 *  @since 03-OCT-2020
 */

class Solution {
  public static boolean binarySearch(int num, long low, long high) {
    if(low <= high) {
      long mid = low + (high - low) / 2;
      if (mid * mid == num) {
        return true;
      } else if (mid * mid > num) {
        return binarySearch(num, low, mid - 1);
      } else {
        return binarySearch(num, mid + 1, high);
      }
    } else {
      return false;
    }
  }
  
  public boolean isPerfectSquare(int num) {
    return binarySearch(num, 0, num);
  }
}