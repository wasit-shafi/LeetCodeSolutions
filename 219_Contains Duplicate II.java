/**
 *  @author WasitShafi
 *  @since 28-AUG-2020
 */

class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Boolean isFound = false;
    int length = nums.length;
    HashMap<Integer, Integer> m = new HashMap<>();
    
    for (int i = 0; i < length; i++) {
      if ((m.containsKey(nums[i])) && (i - m.get(nums[i]) <=  k)) {
          isFound = true;
          break;
      }
      m.put(nums[i], i);
    }
    return isFound;
  }
}