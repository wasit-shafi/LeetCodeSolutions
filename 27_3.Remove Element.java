/**
 *  @author WasitShafi
 *  @since 30-AUG-2021
 */

class Solution {
  public int removeElement(int[] nums, int val) {
    int i = 0;
    int j = nums.length;
    
    while (i < j) {
      // Mentioned in Problem Statement: The relative order of the elements may be changed.
      if (nums[i] == val) {
        nums[i] = nums[--j];
      } else {
        i++;
      }
    }
    return j;
  }
}
