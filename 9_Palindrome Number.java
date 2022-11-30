/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int temp = x;
    int xReverse = 0;
    
    while (temp != 0) {
      xReverse = xReverse * 10 + (temp % 10);
      temp /= 10;
    }
    
    return x == xReverse;
  }
}