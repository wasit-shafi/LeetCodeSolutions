// URL:https://leetcode.com/problems/two-sum/?envType=study-plan&id=data-structure-i
/**
 * @author WasitShafi
 * @since 27-NOV-2022
 */

class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> distinctElements = new HashMap<Integer, Integer>();
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      if (distinctElements.containsKey(target - nums[i])) {
        result[0] = distinctElements.get(target - nums[i]);
        result[1] = i;
        break;
      }
      distinctElements.put(nums[i], i);
    }
    return result;
  }
}