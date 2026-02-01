/**
 * @author WasitShafi
 * @since 01-FEB-2026
 */

class Solution {
  public int trap(int[] height) {
    int totalTrappedWater = 0;
    int leftMax = Integer.MIN_VALUE;
    int rightMax = Integer.MIN_VALUE;
    int[] leftMaxArr = new int[height.length];
    int[] rightMaxArr = new int[height.length];

    for (int leftIndex = 0, rightIndex = height.length - 1; leftIndex < height.length; leftIndex++, rightIndex--) {
      leftMax = height[leftIndex] > leftMax ? height[leftIndex] : leftMax;
      rightMax = height[rightIndex] > rightMax ? height[rightIndex] : rightMax;

      leftMaxArr[leftIndex] = leftMax;
      rightMaxArr[rightIndex] = rightMax;
    }

    // CTM: On the edges, water cannot be trapped

    for (int i = 1; i < height.length - 1; i++) {
      totalTrappedWater += Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i];
    }

    return totalTrappedWater;
  }
}