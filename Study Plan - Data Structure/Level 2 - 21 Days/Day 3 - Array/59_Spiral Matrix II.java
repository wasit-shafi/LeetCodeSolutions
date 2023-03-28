
// URL: https://leetcode.com/problems/spiral-matrix-ii/?envType=study-plan&id=data-structure-ii
/**
 * @author WasitShafi
 * @since 28-MAR-2023
 */

class Solution {
  public int[][] generateMatrix(int n) {
    int counter = 1;
    int half = n / 2;
    int topRow = -1;
    int bottomRow = -1;
    int leftColumn = -1;
    int rightColumn = -1;
    int[][] matrix = new int[n][n];

    if (n == 1) {
      matrix[0][0] = counter;
    } else {
      for (int i = 0; i < half; i++) {
        topRow = leftColumn = i;
        bottomRow = rightColumn = n - i - 1;

        // set top row
        for (int column = leftColumn; column <= rightColumn; column++) {
          matrix[topRow][column] = counter++;
        }

        // set right column
        for (int row = topRow + 1; row <= bottomRow; row++) {
          matrix[row][rightColumn] = counter++;
        }

        // set bottom row
        for (int column = rightColumn - 1; column >= leftColumn; column--) {
          matrix[bottomRow][column] = counter++;
        }

        // set left column
        for (int row = bottomRow - 1; row > topRow; row--) {
          matrix[row][leftColumn] = counter++;
        }
      }

      if (++topRow == --bottomRow && matrix.length % 2 == 1) {
        matrix[topRow][bottomRow] = counter;
      }
    }
    return matrix;
  }
}