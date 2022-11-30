/**
 *  @author WasitShafi
 *  @since 16-OCT-2021
 */

class Solution {
  public int maxSubArray(int[] nums) {
    // consider 3 cases :
    // 1. all are -ve values => only single value is answer
    // 2. all are +ve value => sum of all the value is answer
    // 3. combination of -ve & +ve value => have to find it :)
    int max_so_far = 0;
    int max_ends_here = 0;
    boolean allNegativeNumbers = true;
    int smallestNeagtive = Integer.MIN_VALUE;
    
    for (int i = 0; i < nums.length; i++) {
      max_ends_here += nums[i];
      
      if (max_ends_here < 0) {
        // kadanes doesn't work for all negative number, as it will set max sum 0
         max_ends_here = 0; // represents no array or max will be only single digit
      }
      
      if (max_so_far < max_ends_here) {
         max_so_far = max_ends_here;
      }
      
      if (nums[i] >= 0) {
        allNegativeNumbers = false;
      }
      if (nums[i] < 0  && nums[i] > smallestNeagtive) {
        smallestNeagtive = nums[i];
      }
    }
    
    return allNegativeNumbers ? smallestNeagtive :max_so_far;
  }
}