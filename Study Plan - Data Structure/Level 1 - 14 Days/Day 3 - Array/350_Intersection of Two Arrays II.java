/**
 * @author WasitShafi
 * @since 28-NOV-2022
 */
// Question:https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=study-plan&id=data-structure-i

class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    int[] elementFrequency = new int[10001];
    List<Integer> result = new ArrayList<Integer>();

    // memory optimization can be done using maps for the smaller array between nums1 and nums2
    for (int num : nums1) {
      elementFrequency[num]++;
    }

    for (int num : nums2) {
      if (elementFrequency[num] > 0) {
        result.add(num);
        elementFrequency[num]--;
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}