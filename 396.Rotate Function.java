/**
 *  @author WasitShafi
 *  @since 16-SEP-2020
 */

class Solution {
  public int maxRotateFunction(int[] A) {
    int sum;
    int length = A.length;
    int max = Integer.MIN_VALUE;
      
    if (length == 0) return 0;
    for (int i = 0; i < length; i++) {
      sum = 0;
      for (int j = 0; j < length; j++) {
        sum += j * A[(j + i) % length];
      }
      if (sum > max) {
        max = sum;
      }
    }
    return max;
  }
}