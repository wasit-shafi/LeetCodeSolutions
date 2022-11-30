/**
 *  @author WasitShafi
 *  @since 05-SEP-2020
 */

class Solution {
  public int[] shuffle(int[] nums, int n) {
    int len = 2 * n;
    
    for (int j = len - 1, i = n - 1 ; j >= n; j--, i--) {
      nums[j] <<= 10;
      nums[j] |= nums[i];
    }
    
    for(int i = 0, j = n; j < len; j++) {
      nums[i++] = nums[j] & 1023;
      nums[i++] = nums[j] >> 10;
    }
    
    return nums;
  }
}