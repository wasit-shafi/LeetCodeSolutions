/**
 * @author WasitShafi
 * @since 22-AUG-2025
 */

class Solution {
  public int longestSubarray(int[] nums) {
    int left = 0;
    int right = 0;
    int countZeros = 0;
    int consecutiveLength = 0;
    int consecutiveMaxLength = 0;

    while (right < nums.length) {
      if (nums[right] == 0) {
        countZeros++;
      }

      while (countZeros > 1) {
        if (nums[left++] == 0) {
          countZeros--;
        }
      }

      consecutiveLength = right - left + 1;
      if (consecutiveLength > consecutiveMaxLength) {
        consecutiveMaxLength = consecutiveLength;
      }

      right++;
    }

    return consecutiveMaxLength - 1;
  }
}