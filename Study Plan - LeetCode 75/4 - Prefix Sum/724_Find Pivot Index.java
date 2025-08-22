/**
 * @author WasitShafi
 * @since 22-AUG-2025
 */

class Solution {
  public int pivotIndex(int[] nums) {
    int[] prefixSum = new int[nums.length];
    int[] suffixSum = new int[nums.length];

    prefixSum[0] = nums[0];
    suffixSum[nums.length - 1] = nums[nums.length - 1];

    for (int i = 1, j = nums.length - 1 - 1; i < nums.length; i++, j--) {
      prefixSum[i] = prefixSum[i - 1] + nums[i];
      suffixSum[j] = suffixSum[j + 1] + nums[j];
    }

    for (int i = 0, leftSum = 0, rightSum = 0; i < nums.length; i++) {
      leftSum = i == 0 ? 0 : prefixSum[i - 1];
      rightSum = i == nums.length - 1 ? 0 : suffixSum[i + 1];

      if (leftSum == rightSum) {
        return i;
      }
    }

    return -1;
  }
}