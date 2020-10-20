
/**
 *  @author WasitShafi
 *  @since 07-SEP-2020
 */

class Solution {
  public int getIndex(int[] nums, int low, int high, int key) {
    if (low <= high)
    {
      int mid = low + (high - low) / 2;
      if (nums[mid] == key) {
        return mid;
      }
      if(nums[mid] > key) {
        return getIndex(nums, low, mid - 1, key);
      } else {
        return getIndex(nums, mid + 1, high, key);
      }
    } else {
      return low;
    }
  }
  
  public int searchInsert(int[] nums, int target) {
    return getIndex(nums, 0, nums.length - 1, target);
  }
}