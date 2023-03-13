
// URL: https://leetcode.com/problems/3sum/?envType=study-plan&id=data-structure-ii
// As expected got TLE, only 308 / 312 test cases passed
/**
 * @author WasitShafi
 * @since 10-MAR-2023
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            temp.add(nums[j]);
            temp.add(nums[k]);
            Collections.sort(temp);

            // check if the same list is already in result
            boolean isAlreadyPresent = false;
            for (List<Integer> l : result) {
              if (l.get(0) == temp.get(0) && l.get(1) == temp.get(1) && l.get(2) == temp.get(2)) {
                isAlreadyPresent = true;
                break;
              }
            }
            if (!isAlreadyPresent) {
              result.add(temp);
            }
          }
        }
      }
    }
    return result;
  }
}