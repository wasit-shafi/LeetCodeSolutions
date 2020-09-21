/**
 *  @author WasitShafi
 *  @since 21-SEP-2020
 */

class Solution {
  public boolean isPowerOfThree(int n) {
    if (n  < 1) {
      return false;
    } else {
      long maxPowerOfThree = 1;

      while (maxPowerOfThree < (Integer.MAX_VALUE)) {
        maxPowerOfThree *= 3;
      }
      return maxPowerOfThree % n == 0 ? true : false;
    }
  }
}