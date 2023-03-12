
// URL: https://leetcode.com/problems/3sum/?envType=study-plan&id=data-structure-ii
// After trying some optimization got TLE as well, only 308 / 312 test cases passed
/**
 * @author WasitShafi
 * @since 12-MAR-2023
 */
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    int sum;
    int targetSum;
    int leftIndex;
    int rightIndex;
    List<List<Integer>> result = new ArrayList<>();

    Arrays.sort(nums);
    for (int targetIndex = 0; targetIndex < nums.length; targetIndex++) {
      targetSum = -nums[targetIndex];

      leftIndex = 0;
      rightIndex = nums.length - 1;
      while (leftIndex < rightIndex) {
        if (leftIndex == targetIndex) {
          leftIndex++;
        } else if (rightIndex == targetIndex) {
          rightIndex--;
        } else {
          sum = nums[leftIndex] + nums[rightIndex];
          if (sum == targetSum) {
            List<Integer> temp = new ArrayList<>();

            temp.add(nums[targetIndex]);
            temp.add(nums[leftIndex]);
            temp.add(nums[rightIndex]);
            Collections.sort(temp);

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
            leftIndex++;// increment leftIndex++ or decrement rightIndex--, but not both
          } else if (sum < targetSum) {
            leftIndex++;
          } else if (sum > targetSum) {
            rightIndex--;
          }
        }
      }
    }
    return result;
  }
}