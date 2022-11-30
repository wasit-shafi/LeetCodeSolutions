/**
 *  @author WasitShafi
 *  @since 30-AUG-2021
 */

class Solution {
  public static void moveLeftByOne(int[] nums, int startIndex, int endIndex) {
    for (int i = startIndex; i < endIndex - 1; i++) {
      nums[i] = nums[i + 1];
    }
  }
  
  public int removeElement(int[] nums, int val) {
    int frequency = 0;
    
    for (int i = 0; i + frequency < nums.length; i++) {
      if (nums[i] == val) {
        moveLeftByOne(nums, i, nums.length - frequency);
        frequency++;
        if (i + 1 < nums.length) {
          i--;
        }  
      }
    }
    return nums.length - frequency;
  }
}
