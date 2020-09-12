/**
 *  @author WasitShafi
 *  @since 11-SEP-2020
 */

class Solution {
  public int maxProduct(int[] nums) {
    int max1;
    int max2;
    int length = nums.length;
    
    if (nums[0] > nums[1]) {
        max1 = nums[0];
        max2 = nums[1];
    } else {
        max1 = nums[1];
        max2 = nums[0];
    }

    for (int i = 2; i < length; i++) {
      if (nums[i] > max1) {
          max2 = max1;
          max1 = nums[i];
      } else if (nums[i] > max2) {
        max2 = nums[i];
      }
    }
    return (max1 - 1) * (max2 - 1);
  }
}