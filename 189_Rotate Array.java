/**
 *  @author WasitShafi
 *  @since 03-SEP-2020
 */

class Solution {
  public static void reverse(int[] nums, int start, int end) {
    while(start < end) {
      nums[start] = nums[start] + nums[end];
      nums[end] = nums[start] - nums[end];
      nums[start] = nums[start] - nums[end];
      start++;
      end--;
    }
  }
  
  public void rotate(int[] nums, int k) {
      int length = nums.length;
      
      if (k != 0 && length != 1) {
        k = k % length;
        reverse(nums, 0, length - k - 1);
        reverse(nums, length - k, length - 1);
        reverse(nums, 0, length - 1);
    }
  }
}