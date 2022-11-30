/**
 * @author WasitShafi
 * @since 29-NOV-2022
 */
// Question:https://leetcode.com/problems/reshape-the-matrix/?envType=study-plan&id=data-structure-i
// Referred https://leetcode.com/problems/reshape-the-matrix/solutions/2835288/java-o-n-1ms-solution/
class Solution {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    int noOfRows = mat.length, noOfColumn = mat[0].length, countElemnts = 0;
    if (noOfRows * noOfColumns != r * c || (noOfRows == r && noOfColumns == c)) {
      return mat;
    }

    int[][] result = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {



        
        result[i][j] = mat[count / noOfColumns][count % noOfRows];
      }
    }
    return result;
  }
}