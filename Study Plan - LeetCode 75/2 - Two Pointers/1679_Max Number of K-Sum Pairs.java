/**
 * @author WasitShafi
 * @since 15-AUG-2025
 */

class Solution {
  public int maxOperations(int[] nums, int k) {
    int count = 0;
    int left = 0;
    int right = nums.length - 1;

    Arrays.sort(nums);
    while (left < right) {
      if (nums[left] + nums[right] == k) {
        count++;
        left++;
        right--;
      } else if (nums[left] + nums[right] < k) {
        left++;
      } else {
        right--;
      }
    }

    return count;
  }
}