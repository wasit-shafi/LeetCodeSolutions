/**
 * @author WasitShafi
 * @since 15-AUG-2025
 */

class Solution {
  public int maxOperations(int[] nums, int k) {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (Integer num : nums) {
      if (map.containsKey(k - num)) {
        count++;
        if (map.get(k - num) == 1) {
          map.remove(k - num);
        } else {
          map.put(k - num, map.get(k - num) - 1);
        }
      } else if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }

    return count;
  }
}