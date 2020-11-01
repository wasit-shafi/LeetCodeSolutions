/**
 *  @author WasitShafi
 *  @since 24-OCT-2020
 */

class Solution {
  public int getSum(int n) {
    int sum = 0;
    while (n != 0) {
      sum += (n % 10) * (n % 10);
      n /= 10;
    }
    return sum;
  }

  public boolean isHappy(int n) {
    int slow = n;
    int fast = getSum(n);

    while (slow != fast) {
      slow = getSum(slow);
      fast = getSum(getSum(fast));
      if (fast == 1) {
        return true;
      }
    }
    return slow == 1;
  }
}
