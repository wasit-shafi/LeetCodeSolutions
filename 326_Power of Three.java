/**
 *  @author WasitShafi
 *  @since 15-SEP-2020
 */

class Solution {
  public boolean isPowerOfThree(int n) {
      return n > 0 && (int)(Math.pow(3, 19) % n) == 0 ? true : false;
  }
}