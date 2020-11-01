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
    HashSet<Integer> set = new HashSet<>();

    while (n != 1) {
      n = getSum(n);
      if (set.contains(n)) {
        return false;
      } else {
        set.add(n);
      }
    }
    return true;
  }
}
