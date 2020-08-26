/**
 *  @author WasitShafi
 *  @since 26-AUG-2020
 */

class Solution {
  public int majorityElement(int[] nums) {
    int res = -1;
    int length = nums.length;
    int half = length / 2;
    Map<Integer, Integer> m = new HashMap<>();
    
    if (length == 1) {
      res = nums[0];
    } else {
      for (int i = 0; i < length; i++) {
        if (m.containsKey(nums[i])) {
          m.put(nums[i], m.get(nums[i]) + 1);
          if (m.get(nums[i]) > half) {
            res = nums[i];
            break;
          }
        } else {
          m.put(nums[i], 1);
        }
      }
    }
    return res;
  }
}