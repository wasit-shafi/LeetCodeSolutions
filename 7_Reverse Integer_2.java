/**
 *  @author WasitShafi
 *  @since 26-OCT-2020
 */

class Solution {
  public int reverse(int x) {
    long X = x;
    long reverse = 0;

    if (X  < 0) {
      X = -X;
    }

    while (X != 0) {
      reverse = reverse * 10 + X % 10;
      X /= 10;
    }

    if (x < 0) {
      return reverse >= Integer.MAX_VALUE ? 0 : (int)(long)reverse * -1;
    } else {
      return reverse > Integer.MAX_VALUE ? 0 : (int)(long)reverse;
    }
  }
}
