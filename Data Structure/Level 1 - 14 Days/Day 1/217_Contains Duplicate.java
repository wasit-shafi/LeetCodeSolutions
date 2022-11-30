/**
 * @author WasitShafi
 * @since 26-NOV-2022
 */
// Question:https://leetcode.com/problems/contains-duplicate/?envType=study-plan&id=data-structure-i

class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> distinctElements = new HashSet<Integer>();

    for (int num : nums) {
      if (distinctElements.contains(num)) {
        return true;
      }
      distinctElements.add(num);
    }
    return false;
  }
}