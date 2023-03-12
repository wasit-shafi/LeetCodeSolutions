
// URL: https://leetcode.com/problems/single-number/description/?envType=study-plan&id=data-structure-ii
/**
 * @author WasitShafi
 * @since 10-MAR-2023
 */
import java.util.Set;
import java.util.HashSet;

class Solution {
  public int singleNumber(int[] nums) {
    Set<Integer> distinctNums = new HashSet<>();

    for(int n:nums) {
      if (distinctNums.contains(n)) {
        distinctNums.remove(n);
      } else {
        distinctNums.add(n);
      }
    }
    return distinctNums.iterator().next();
  }
}