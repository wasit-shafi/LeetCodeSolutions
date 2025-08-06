/**
 * @author WasitShafi
 * @since 06-AUG-2020
 */
// Referred : https://www.youtube.com/watch?v=G9zKmhybKBM

class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];

    for (int i = 0, leftSideProduct = 1; i < nums.length; i++) {
      result[i] = leftSideProduct;
      leftSideProduct = leftSideProduct * nums[i];
    }

    for (int i = nums.length - 1, rightSideProduct = 1; i >= 0; i--) {
      result[i] = result[i] * rightSideProduct;
      rightSideProduct = rightSideProduct * nums[i];
    }

    return result;
  }
}