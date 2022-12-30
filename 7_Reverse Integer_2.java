/**
 * @author WasitShafi
 * @since 26-OCT-2020
 */

// My previous 2 solution is actually incorrect for this specific question as is
// mentioned we are dealing with 32-bit environment, so how can i use long
// (64-bit number)...:)
// Note:Assume we are dealing with an environment that could only store integers
// within the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of
// this problem, assume that your function returns 0 when the reversed integer
// overflows.
class Solution {
  public int reverse(int x) {
    int reverse = 0;
    // CTM :
    // Integer.MAX_VALUE = 2147483647 (last digit = 7, Integer.MAX_VALUE / 10 = 214748364)
    // Integer.MIN_VALUE = -2147483648 (last digit = -8, Integer.MIN_VALUE / 10 = -214748364)
    while (x != 0) {
      if ((reverse > Integer.MAX_VALUE / 10) || (reverse == Integer.MAX_VALUE / 10 && (x % 10) > 7)) {
        return 0;
      } else if ((reverse < Integer.MIN_VALUE / 10) || (reverse == Integer.MIN_VALUE / 10 && (x % 10) < -8)) {
        return 0;
      }

      reverse = reverse * 10 + x % 10;
      x /= 10;
    }
    return reverse;
  }
}
