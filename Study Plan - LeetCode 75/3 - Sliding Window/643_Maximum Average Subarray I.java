/**
 * @author WasitShafi
 * @since 18-AUG-2025
 */

class Solution {
  public double findMaxAverage(int[] nums, int k) {
    int i = 0;
    double sum = 0;
    double average = 0;
    double maxAverage = 0;

    while (i < k) {
      sum += nums[i++];
    }
    maxAverage = sum / k;

    while (i < nums.length) {
      sum = sum - nums[i - k];
      sum = sum + nums[i++];
      average = sum / k;

      if (average > maxAverage) {
        maxAverage = average;
      }
    }

    return maxAverage;
  }
}