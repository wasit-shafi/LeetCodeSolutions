/**
 *  @author WasitShafi
 *  @since 17-SEP-2020
 */

class Solution {
  public boolean checkSubarraySum(int[] nums, int k) {
    int sum;
    int length = nums.length;
    
    if(k == 0) {
      for (int i = 0 ; i < length - 1 ; i++) {
        if (nums[i] == 0 && nums[i + 1] == 0) {
          return true;
        }
      }
      return false;
    }

    for (int i = 1; i < length; i++) {
      nums[i] += nums[i - 1];
    }
    
    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
        if (i == 0) {
          sum = nums[j];
        } else {
          sum = nums[j] - nums[i - 1];
        }
        if(sum % k == 0) {
          return true;
        }
      }
    }
    
    return false;
  }
}