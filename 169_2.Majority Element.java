/**
 *  @author WasitShafi
 *  @since 26-AUG-2020
 */

class Solution {
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}