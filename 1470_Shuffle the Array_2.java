/**
 *  @author WasitShafi
 *  @since 05-SEP-2020
 */

class Solution {
  public int[] shuffle(int[] nums, int n) {
    int[] temp = Arrays.copyOfRange(nums, n, 2 * n);
    int i = n - 1;
    int j = 2 * n - 2;

    while (i > 0) {
      nums[j] = nums[i--];
      j = j - 2;
    }
    
    j = 0;
    i = 1;
    while (j < n) {
      nums[i] = temp[j++];
      i = i + 2;
    }
    
    return nums;
  }
}