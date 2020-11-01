class Solution {
  public int reverse(int x) {
    long reverse = 0;
    System.out.println(Integer.MIN_VALUE);
    boolean negative = false;
    if (x < 0) {
      x *= -1;
      negative = true;
    }

    while (x != 0) {
      System.out.println(x%10);
      reverse = reverse * 10 + (x % 10);
      x /= 10;
    }

    if (negative) {
      if ((-1 * reverse) < Integer.MIN_VALUE) {
        return 0;
      }
    } else {
      if (reverse > Integer.MAX_VALUE) {
        return 0;
      }
    }

//    x = reverse.intValue();
    return (int)(long)reverse;
  }
}
