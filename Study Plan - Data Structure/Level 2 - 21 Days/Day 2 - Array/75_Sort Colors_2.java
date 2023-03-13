
// URL: https://leetcode.com/problems/sort-colors/?envType=study-plan&id=data-structure-ii
// Referred for one-pass solutions: https://www.youtube.com/watch?v=oaVa-9wmpns
/**
 * @author WasitShafi
 * @since 13-MAR-2023
 */

class Solution {
  public void sortColors(int[] nums) {
    int low = 0;
    int mid = 0;
    int high = nums.length - 1;
    int temp;
    // LOGIC: the idea is to move all 0 towards left side of array, and 2 towards
    // the right side of array, rest 1 will be automatically placed correctly

    while (mid <= high) {
      if (nums[mid] == 0) {
        temp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
        low++;
        mid++;
      } else if (nums[mid] == 1) {

        mid++;
      } else if (nums[mid] == 2) {
        temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
        high--;
      }
    }
  }
}