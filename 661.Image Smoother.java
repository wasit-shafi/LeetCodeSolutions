/**
 *  @author WasitShafi
 *  @since 27-AUG-2020
 */

class Solution {
  public int[][] imageSmoother(int[][] M) {
    int r = M.length;
    int c = M[0].length;
    int[][] res = new int[r][c];
    int sum;
    int surroundingCells;
    
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        sum = M[i][j];
        surroundingCells = 1;
        if (i - 1 >= 0 && j - 1 >= 0) { // top left
          sum += M[i - 1][j - 1];
          surroundingCells++;
        }
        if (i - 1 >= 0) { // top
          sum += M[i - 1][j];
          surroundingCells++;
        }
        if (i - 1 >= 0 && j + 1 < c) { // top right
          sum += M[i-1][j+1];
          surroundingCells++;
        }
        if (j + 1 < c) { // right
          sum += M[i][j+1];
          surroundingCells++;
        }
        if (i + 1 < r && j + 1 < c) { // bottom right
          sum += M[i+1][j+1];
          surroundingCells++;
        }
        if (i + 1 < r) { // bottom
          sum += M[i+1][j];
          surroundingCells++;
        }
        if (i + 1 < r && j - 1 >= 0) { // bottom left
          sum += M[i+1][j-1];
          surroundingCells++;
        }
        if (j - 1 >= 0) { // left
          sum += M[i][j-1];
          surroundingCells++;
        }
        res[i][j] = sum / surroundingCells;
      }
    }
    return res;
  }
}