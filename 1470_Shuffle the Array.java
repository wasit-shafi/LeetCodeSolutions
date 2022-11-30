/**
 *  @author WasitShafi
 *  @since 05-SEP-2020
 */

class Solution {
  public int[] shuffle(int[] nums, int n) {
    int i = 0;
    int j = n;
    int len = 2 * n;
    int[] res = new int[len];
    boolean flag = true;
    for (int k = 0; k < len; k++) {
      if (flag) {
        res[k] = nums[i++];
      } else {
        res[k] = nums[j++];
      }
      flag = !flag;
    }
  return res;
  }
}