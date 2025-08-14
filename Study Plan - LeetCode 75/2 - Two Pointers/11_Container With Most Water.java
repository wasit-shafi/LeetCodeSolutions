/**
 * @author WasitShafi
 * @since 14-AUG-2025
 */

class Solution {
  public int maxArea(int[] height) {

    int left = 0;
    int right = height.length - 1;
    int currentWater;
    int maxWater = Integer.MIN_VALUE;

    while (left < right) {
      currentWater = Math.min(height[left], height[right]) * (right - left);

      if (currentWater > maxWater) {
        maxWater = currentWater;
      }

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return maxWater;
  }
}