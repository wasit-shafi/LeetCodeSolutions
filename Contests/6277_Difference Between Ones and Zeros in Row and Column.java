/**
 * @author WasitShafi
 * @since 26-NOV-2022
 */
// Question:https://leetcode.com/contest/biweekly-contest-92/problems/difference-between-ones-and-zeros-in-row-and-column
class Solution {
  public int[][] onesMinusZeros(int[][] grid) {
    int noOfRows = grid.length;
    int noOfColumns = grid[0].length;

    int[][] rowData = new int[2][noOfRows];
    int[][] columnData = new int[2][noOfColumns];
    int[][] result = new int[noOfRows][noOfColumns];
    int countZeros = 0;
    int countOnes = 0;

    // memoize no. of zeros and ones in grid for rows
    for (int i = 0; i < noOfRows; i++) {
      countZeros = 0;
      countOnes = 0;
      for (int j = 0; j < noOfColumns; j++) {
        if (grid[i][j] == 0) {
          countZeros++;
        } else {
          countOnes++;
        }
      }
      rowData[0][i] = countZeros;
      rowData[1][i] = countOnes;
    }
    // memoize no. of zeros and ones in grid for columns
    for (int i = 0; i < noOfColumns; i++) {
      countZeros = 0;
      countOnes = 0;
      for (int j = 0; j < noOfRows; j++) {
        if (grid[j][i] == 0) {
          countZeros++;
        } else {
          countOnes++;
        }
      }
      columnData[0][i] = countZeros;
      columnData[1][i] = countOnes;
    }
    // make resultant matrix using given formula
    for (int i = 0; i < noOfRows; i++) {
      for (int j = 0; j < noOfColumns; j++) {
        result[i][j] = rowData[1][i] + columnData[1][j] - rowData[0][i] - columnData[0][j];
      }
    }
    return result;

  }
}