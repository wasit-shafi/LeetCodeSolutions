/**
 *  @author WasitShafi
 *  @since 13-OCT-2020
 */

class Solution {
  public int missingNumber(int[] nums) { // Time Complexity : O(N Log N)
    int i;
    int n = nums.length;
    
    Arrays.sort(nums);
    for (i = 0; i < n; i++) {
      if (nums[i] != i) {
        return i;
      }
    }
    return i;
  }
}