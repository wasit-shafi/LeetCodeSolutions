// URL: https://leetcode.com/problems/search-a-2d-matrix-ii/description/
/**
 * @author WasitShafi
 * @since 30-MAR-2023
 */

class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int x = 0;
    int totalRows = matrix.length;
    int totalColumns = matrix[0].length;
    boolean containsTarget = false;

    for (int r = 0; r < totalRows && matrix[r][totalColumns - 1] < target; r++) {
      x++; // skip the rows
    }

    OUTER_LOOP: for (int r = x; r < totalRows && matrix[r][0] <= target; r++) {
      // now traverse the rows till elements is less than or equal to target
      for (int c = 0; c < totalColumns && matrix[r][c] <= target; c++) {
        if (matrix[r][c] == target) {
          containsTarget = true;
          break OUTER_LOOP;
        }
      }
    }
    return containsTarget;
  }
}