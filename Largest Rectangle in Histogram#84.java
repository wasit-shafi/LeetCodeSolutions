/*
 *  @author WasitShafi
 *  @since 21-AUG-20
 */
// Using stack based approach time complexity will be O(N)
// URL : https://leetcode.com/problems/largest-rectangle-in-histogram
class Solution { // Time Complexity O(N^2)
    public int largestRectangleArea(int[] heights) {
      int max = 0;
      int temp = 0;
      int left = -1;
      int right = -1;
      int length = heights.length;
      
      for (int i = 0 ; i < length; i++) {
        left = i;
        while(left >= 0 && heights[left] >= heights[i]) {
          left--;
        }
        left++;
        
        right = i;
        while(right < length && heights[right] >= heights[i]) {
          right++;
        }
        right--;
        
        temp = heights[i] * (right - left + 1);
        if (max < temp) {
          max = temp;
        }
      }
      return max;
    }
}