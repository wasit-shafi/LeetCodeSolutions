/**
 * @author WasitShafi
 * @since 28-NOV-2022
 */
// Question:https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=study-plan&id=data-structure-i

class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> result = new ArrayList<Integer>();
    Map<Integer, Integer> elementFrequency = new HashMap<Integer, Integer>();

    // memory optimization
    int[] smallestNums = nums1.length <= nums2.length ? nums1 : nums2;
    int[] largestNums = nums1.length > nums2.length ? nums1 : nums2;

    for (int num : smallestNums) {
      if (elementFrequency.containsKey(num)) {
        elementFrequency.put(num, elementFrequency.get(num) + 1);
      } else {
        elementFrequency.put(num, 1);
      }
    }

    for (int num : largestNums) {
      if (elementFrequency.containsKey(num) && elementFrequency.get(num) > 0) {
        result.add(num);
        if (elementFrequency.get(num) == 1) {
          elementFrequency.remove(num);
        } else {
          elementFrequency.put(num, elementFrequency.get(num) - 1);
        }
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}