
// URL: https://leetcode.com/problems/sort-colors/?envType=study-plan&id=data-structure-ii
/**
 * @author WasitShafi
 * @since 13-MAR-2023
 */

class Solution {
  public void sortColors(int[] nums) {
    final int RED = 0;
    final int WHITE = 1;
    final int BLUE = 2;
    final int[] colorsCount = { 0, 0, 0 };

    for (int n : nums) {
      colorsCount[n]++;
    }
    for (int index = 0; index < nums.length; index++) {
      if (colorsCount[RED] > 0) {
        nums[index] = 0;
        colorsCount[RED]--;
      } else if (colorsCount[WHITE] > 0) {
        nums[index] = 1;
        colorsCount[WHITE]--;
      } else if (colorsCount[BLUE] > 0) {
        nums[index] = 2;
        colorsCount[BLUE]--;
      }
    }
  }
}