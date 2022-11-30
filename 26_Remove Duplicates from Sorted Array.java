/**
 *  @author WasitShafi
 *  @since 15-AUG-2021
 */

class Solution {
  public int removeDuplicates(int[] nums) {
    int j = 0;
    
    for (int i = 0; i < nums.length; i++, j++) {
      while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
        i++;
      }
      nums[j] = nums[i];
    }
   return j;
  }
}
