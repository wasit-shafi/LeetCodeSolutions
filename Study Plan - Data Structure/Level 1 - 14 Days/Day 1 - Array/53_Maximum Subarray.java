// URL: https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i
/**
 * @author WasitShafi
 * @since 26-NOV-2022
 */
class Solution {
  public int maxSubArray(int[] nums) {
    int maxSoFar = Integer.MIN_VALUE;
    int maxEndsHere = 0;

    for (int num : nums) {
      maxEndsHere += num;

      if (maxSoFar < maxEndsHere) {
        maxSoFar = maxEndsHere;
      }

      if (maxEndsHere < 0) {
        maxEndsHere = 0;
      }
    }
    return maxSoFar;
  }
}