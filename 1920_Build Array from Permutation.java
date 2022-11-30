/**
 *  @author WasitShafi
 *  @since 25-jul-20201
 */

/**
 *  @author WasitShafi
 *  @since 25-JUL-2021
 */
class Solution {
  public int[] buildArray(int[] nums) {  
    int ans[] = new int[nums.length];
    
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[nums[i]];
    }
    
    return ans;
  }
}
