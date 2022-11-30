/**
 *  @author WasitShafi
 *  @since 24-SEP-2020
 */

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int ans[] = new int[2];
    int length = nums.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0 ; i < length; i++) {
      if (map.containsKey(target - nums[i])) {
        ans[0] = map.get(target - nums[i]);
        ans[1] = i;
        break;
      } else {
        map.put(nums[i], i);
      }
    }
    return ans;
  }
}