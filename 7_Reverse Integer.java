/**
 * @author WasitShafi
 * @since 30-DEC-2022
 */
// Question: https://leetcode.com/problems/reverse-integer/description/

class Solution {
  public int reverse(int x) {
    int rev = 0;
    boolean isPositive = x >= 0 ? true : false;
    while (x != 0) {
      // 10l should be avoided/not valid as we can't use 64-bit integers
      if ((isPositive == true && rev * 10l + (x % 10) > Integer.MAX_VALUE)
          || (isPositive == false && (rev * 10l + (x % 10)) < Integer.MIN_VALUE)) {
        return 0;
      }
      rev = rev * 10 + (x % 10);
      x = x / 10;
    }
    return rev;
  }
}