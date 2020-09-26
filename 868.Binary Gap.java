/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

class Solution {
  public int binaryGap(int N) {
    int i = 1;
    int low = -1;
    int high = -1;
    int maxGap = 0;
    
    while (N != 0) {
      if (N % 2 == 1) {
        if (low == -1) {
          low = i;
        } else {
          high = i;
          if (high - low > maxGap)
          {
            maxGap = high - low;
          }
          low = high;
        }
      }
      i++;
      N = N / 2;
    }
    
    return maxGap;
  }
}