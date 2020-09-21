/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

class Solution {
  public int findUnsortedSubarray(int[] nums) {
    int l, r;
    int length = nums.length;
    
    for (l = 0; l + 1 < length; l++) {
      if (nums[l] > nums[l + 1]) {
        break;
      }
    }
    
    if (l == length - 1) {
      return 0;
    }
    for (r = length - 1; r > 0 ; r--) {
      if (nums[r] < nums[r - 1]) {
        break;
      }
    }
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = l; i <= r; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    
    for (int i = 0; i < l; i++)
    {
      if (nums[i] > min) {
        l = i;
        break;
      }
    }
    for (int i = length - 1; i > r; i--)
    {
      if (nums[i] < max) {
        r = i;
        break;
      }
    }
    return r - l + 1;
  }
}