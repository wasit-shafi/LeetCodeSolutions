/**
 *  @author WasitShafi
 *  @since 11-SEP-2020
 */

class Solution {
  public int maxProduct(int[] nums) {
    int max1 = nums[0];
    int max2 = Integer.MIN_VALUE;
    int max1Index = 0;
    int length = nums.length;
    
    for (int i = 1; i < length; i++) {
      if (nums[i] > max1){
        max1 = nums[i];
        max1Index = i;
      }
    }
    
    for (int i = 0; i < length; i++) {
      if (nums[i] >= max2 && i != max1Index) {
        max2 = nums[i];
      }
    }
    
    return (max1-1) * (max2-1);
    }
}