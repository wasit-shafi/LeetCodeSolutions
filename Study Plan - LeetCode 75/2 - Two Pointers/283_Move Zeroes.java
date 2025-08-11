/**
 * @author WasitShafi
 * @since 12-AUG-2025
 */

class Solution {
  public void moveZeroes(int[] nums) {
    int i = 0;
    int leftPointer = 0;

    while (i < nums.length) {
      if (nums[i] != 0) {
        nums[leftPointer++] = nums[i];
      }
      i++;
    }

    while (leftPointer < nums.length) {
      nums[leftPointer++] = 0;
    }
  }
}
