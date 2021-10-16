/**
 *  @author WasitShafi
 *  @since 16-OCT-2021
 */

class Solution {
  public int maxSubArray(int[] nums) {
    int max_so_far = 0;
    int max_ends_here = 0;
    int largestNeagtive = Integer.MIN_VALUE;
    boolean isAllNegativeNumbers = true;
    // precise version
    for (int i = 0; i < nums.length; i++) {
      max_ends_here += nums[i];      
      if (max_ends_here < 0) max_ends_here = 0;
      if (max_so_far < max_ends_here) max_so_far = max_ends_here;
      if (isAllNegativeNumbers && nums[i] >= 0) isAllNegativeNumbers = false;
      if (nums[i] < 0  && nums[i] > largestNeagtive) largestNeagtive = nums[i];
    }
    return isAllNegativeNumbers ? largestNeagtive : max_so_far;
  }
}