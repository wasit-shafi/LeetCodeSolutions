/**
 *  @author WasitShafi
 *  @since  25-JUL-2021
 */

class Solution {
  public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int ans[] = new int[n * 2];
    
    for (int i = 0; i < n * 2; i++) {
      ans[i] = nums[i % n];
    }
    return ans;
  }
}
