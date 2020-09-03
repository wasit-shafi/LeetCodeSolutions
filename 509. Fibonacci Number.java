/**
 *  @author WasitShafi
 *  @since 31-AUG-2020
 */

class Solution {
  public int fib(int N) {
    int ans = -1;
    if (N == 0) {
      ans = 0;
    } else if (N == 1) {
      ans = 1;
    } else {
      int term1 = 0;
      int term2 = 1;
      while(N-- != 1) {
        ans = term1 + term2;
        term1 = term2;
        term2 = ans;
      }
    }
    return ans;
  }
}