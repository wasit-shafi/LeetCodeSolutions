
// URL: https://leetcode.com/problems/3sum/?envType=study-plan&id=data-structure-ii
// Referred: https://leetcode.com/problems/3sum/solutions/143636/java-with-set/?orderBy=most_votes
/**
 * @author WasitShafi
 * @since 12-MAR-2023
 */
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    int sum;
    int targetNum;
    int leftIndex;
    int rightIndex;
    Set<List<Integer>> distinctTripletList = new HashSet<>();

    Arrays.sort(nums);
    for (int targetIndex = 0; targetIndex < nums.length; targetIndex++) {
      leftIndex = 0;
      rightIndex = nums.length - 1;
      targetNum = -nums[targetIndex];
      while (leftIndex < rightIndex) {
        if (leftIndex == targetIndex) {
          leftIndex++;
        } else if (rightIndex == targetIndex) {
          rightIndex--;
        } else {
          sum = nums[leftIndex] + nums[rightIndex];
          if (sum < targetNum) {
            leftIndex++;
          } else if (sum > targetNum) {
            rightIndex--;
          } else {
            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[targetIndex]);
            triplet.add(nums[leftIndex]);
            triplet.add(nums[rightIndex]);
            Collections.sort(triplet);
            // if there exists any list in set with same no of element, and of same element
            // ordering then in set no new element will be added
            distinctTripletList.add(triplet);
            leftIndex++; // increment leftIndex++ or decrement rightIndex--, but not both
          }
          // skip duplicate elements
          while (targetNum != 0 && leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex + 1]) {
            leftIndex++;
          }
          // skip duplicate elements
          while (targetNum != 0 && leftIndex < rightIndex && nums[rightIndex] == nums[rightIndex - 1]) {
            rightIndex--;
          }
        }
      }
    }
    return new ArrayList<>(distinctTripletList);
  }
}