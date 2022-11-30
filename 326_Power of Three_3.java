/**
 *  @author WasitShafi
 *  @since 21-SEP-2020
 */

class Solution {
  public static boolean ans(long n, long powerOfThree) {
    if (powerOfThree == n) {
      return true;
    } else if (powerOfThree > n || powerOfThree > Integer.MAX_VALUE) {
      return false;
    } else  {
      return ans(n, powerOfThree * 3);
    }
  }
  public boolean isPowerOfThree(int n) {
    return ans(n, 1);
  }
}