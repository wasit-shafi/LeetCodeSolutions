/**
 * @author WasitShafi
 * @since 23-AUG-2025
 */

class Solution {
  public boolean uniqueOccurrences(int[] arr) {
    Set<Integer> set = new HashSet<Integer>();
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (Integer num : arr) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }

    for (Integer count : map.values()) {
      if (set.contains(count)) {
        return false;
      }
      set.add(count);
    }

    return true;
  }
}