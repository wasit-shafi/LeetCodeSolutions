/**
 * @author WasitShafi
 * @since 06-AUG-2020
 */

class Solution {
  public int[] productExceptSelf(int[] nums) {

    if (nums.length == 2) {
      return new int[] { nums[1], nums[0] };
    }

    int[] prefix = new int[nums.length];
    int[] suffix = new int[nums.length];
    int[] result = nums;

    for (int i = 0, j = nums.length - 1, prefixProduct = 1, suffixProduct = 1; i < nums.length; i++, j--) {
      prefixProduct = prefixProduct * nums[i];
      suffixProduct = suffixProduct * nums[j];
      prefix[i] = prefixProduct;
      suffix[j] = suffixProduct;
    }

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        result[i] = suffix[1];
      } else if (i == nums.length - 1) {
        result[i] = prefix[nums.length - 2];
      } else {
        result[i] = prefix[i - 1] * suffix[i + 1];
      }
    }

    return result;
  }
}