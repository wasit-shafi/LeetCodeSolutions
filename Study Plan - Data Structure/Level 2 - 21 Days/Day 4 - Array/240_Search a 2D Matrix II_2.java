// URL: https://leetcode.com/problems/search-a-2d-matrix-ii/description
// Referred: https://www.youtube.com/watch?v=a5ekmM-9QYo
/**
 * @author WasitShafi
 * @since 30-MAR-2023
 */

class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int x = matrix.length - 1;
    int y = 0;
    int totalColumns = matrix[0].length;
    boolean containsTarget = false;

    // we can start either from top right element or bottom left element, because
    // only from there we clearly make a decision from which side to move the
    // pointer for searching the target element

    // TOP-LEFT: Can't start from here because in both the directions(right or
    // down) elements are greater than the current element so how can we decide
    // which side to move the pointer

    // BOTTOM-RIGHT: Can't start from here because in both the directions(up or
    // let) elements are smaller than the current element so how can we decide
    // which side to move the pointer

    // TOP-RIGHT: can start from here because all the element towards left are less
    // than current element and all the elements towards down are greater than
    // current element

    // BOTTOM-RIGHT: can start from here because all the element towards up are less
    // than current element and all the elements towards right are greater than
    // current element

    while (x >= 0 && y < totalColumns && containsTarget == false) {
      if (matrix[x][y] < target) {
        y++;
      } else if (matrix[x][y] > target) {
        x--;
      } else {
        containsTarget = true;
      }
    }
    return containsTarget;
  }
}