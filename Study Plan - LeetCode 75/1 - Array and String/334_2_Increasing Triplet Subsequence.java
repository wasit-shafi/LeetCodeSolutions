/**
 * @author WasitShafi
 * @since 10-AUG-2025
 */

// https://www.youtube.com/watch?v=JkMPa3OD4BU

class Solution {
  public boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;

    for (int num : nums) {
      if (num <= first) {
        first = num;
      } else if (num <= second) {
        second = num;
      } else {
        return true;
      }
    }

    return false;
  }
}