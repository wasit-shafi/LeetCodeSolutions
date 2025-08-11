/**
 * @author WasitShafi
 * @since 10-AUG-2025
 */

class Solution {
  public boolean increasingTriplet(int[] nums) {

    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i + 1] > nums[i]) {
        for (int j = i + 1; j < nums.length - 1; j++) {
          if (nums[j] > nums[i]) {
            for (int k = j + 1; k < nums.length; k++) {
              if (nums[k] > nums[j]) {
                return true;
              }
            }
          }
        }
      }
    }

    return false;
  }
}