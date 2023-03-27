
// URL: https://leetcode.com/problems/rotate-image/?envType=study-plan&id=data-structure-ii
/**
 * @author WasitShafi
 * @since 27-MAR-2023
 */

class Solution {
  public static void transposeMatrix(int[][] matrix) {
    for (int r = 0; r < matrix.length; r++) {
      for (int c = 0; c < r; c++) {
        matrix[r][c] = matrix[r][c] + matrix[c][r];
        matrix[c][r] = matrix[r][c] - matrix[c][r];
        matrix[r][c] = matrix[r][c] - matrix[c][r];
      }
    }
  }

  public static void reverseMatrixRows(int[][] matrix) {
    int left;
    int right;
    for (int row = 0; row < matrix.length; row++) {
      left = 0;
      right = matrix.length - 1;
      while (left < right) {
        matrix[row][left] = matrix[row][left] + matrix[row][right];
        matrix[row][right] = matrix[row][left] - matrix[row][right];
        matrix[row][left] = matrix[row][left++] - matrix[row][right--];
      }
    }
  }

  public void rotate(int[][] matrix) {
    transposeMatrix(matrix);
    reverseMatrixRows(matrix);
  }
}