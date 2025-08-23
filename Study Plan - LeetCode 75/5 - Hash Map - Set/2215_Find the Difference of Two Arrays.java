/**
 * @author WasitShafi
 * @since 23-AUG-2025
 */

class Solution {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<Integer>();
    Set<Integer> set2 = new HashSet<Integer>();
    List<List<Integer>> result = new ArrayList();

    result.add(new ArrayList<Integer>());
    result.add(new ArrayList<Integer>());

    for (Integer num : nums1) {
      set1.add(num);
    }
    for (Integer num : nums2) {
      set2.add(num);
    }

    for (Integer num : set1) {
      if (!set2.contains(num)) {
        result.get(0).add(num);
      }
    }
    for (Integer num : set2) {
      if (!set1.contains(num)) {
        result.get(1).add(num);
      }
    }

    return result;
  }
}