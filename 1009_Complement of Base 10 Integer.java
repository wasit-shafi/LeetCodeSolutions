/**
 *  @author WasitShafi
 *  @since 26-SEP-2020
 */

class Solution {
  public int bitwiseComplement(int N) {
    if (N == 0) {
      return 1;
    } else {
      int ans = 0;
      int powerOfTwo = 1;

      while (N != 0) {
         if ((N % 2 == 0 ? 1 : 0) == 1) {
           ans += powerOfTwo;
         }
        powerOfTwo = powerOfTwo << 1; // or multiply by 2
        N = N >> 1; // or divide by 2
      }
      return ans;
    }
  }
}