/**
 *  @author WasitShafi
 *  @since 09-DEC-2021
 */

class Solution {
  public static int leftNonGreaterCount(int[] heights, int i) {
    int count = 0;
    for (int j = i; j >=0 && heights[j] >= heights[i + 1]; j--) {
      count++;
    }
    return count;
  }
  public static int rightNonGreaterCount(int[] heights, int i) {
    int count = 0;
    for (int j = i; j < heights.length && heights[j] >= heights[i - 1]; j++) {
      count++;
    }
    return count;
  }
  public int largestRectangleArea(int[] heights) {
    int max = Integer.MIN_VALUE;
    int temp;
    
    for (int i = 0; i <heights.length; i++) {
        temp = heights[i] * (leftNonGreaterCount(heights, i - 1) + 1 + rightNonGreaterCount(heights, i + 1));
      if (max < temp) {
          max = temp;
      }
    }
    return max;
  }
}
