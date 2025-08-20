/**
 * @author WasitShafi
 * @since 20-AUG-2025
 */

// Referred: https://www.youtube.com/watch?v=3E4JBHSLpYk

class Solution {
  public int longestOnes(int[] nums, int k) {
    int left = 0;
    int right = 0;
    int countZeros = 0;
    int consecutiveLength = 0;
    int consecutiveMaxLength = 0;

    while (right < nums.length) {
      if (nums[right] == 0) {
        countZeros++;
      }

      while (countZeros > k) {
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

    return consecutiveMaxLength;
  }
}