/**
 * @author WasitShafi
 * @since 30-NOV-2022
 */
// Question:https://leetcode.com/problems/search-a-2d-matrix/?envType=study-plan&id=data-structure-i
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int noOfRows = matrix.length, noOfColumns = matrix[0].length;

    for (int i = 0; i < noOfRows; i++) {
      if (matrix[i][0] > target) {
        return false;
      }
      for (int j = 0; j < noOfColumns; j++) {
        if (matrix[i][j] == target) {
          return true;
        } else if (matrix[i][j] > target) {
          break;
        }
      }
    }
    return false; 
  }
}