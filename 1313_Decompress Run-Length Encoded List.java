/**
 *  @author WasitShafi
 *  @since  01-AUG-2021
 */
class Solution {
  public int[] decompressRLElist(int[] nums) {
    int n = 0;
    int ans[];
    
    for (int i = 0; i < nums.length; i = i + 2) {
      n += nums[i];
    }
    
    ans = new int[n];
    for (int i = 0, j = 0; i < nums.length; i = i + 2) {
      while (nums[i]-- != 0) {
        ans[j++] = nums[i + 1];
      }
    }
    return ans;
  }
}
