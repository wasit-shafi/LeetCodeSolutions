class Solution {
    public int findUnsortedSubarray(int[] nums) {
      
      int length = nums.length;
      int left = 0;
      int right = length - 1;
      
      while (left < length - 1 && nums[left] <= nums[left + 1]) {
          left++;
      }
      
      while (right > 0 && nums[right] >= nums[right - 1]) {
          right--;
      }
      
      
      return right - left + 1;
    }
  }