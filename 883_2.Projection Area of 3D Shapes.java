/**
 *  @author WasitShafi
 *  @since 16-SEP-2020
 */

class Solution {
    public int projectionArea(int[][] grid) {
      int maxRow;
      int maxCol;
      int ans = 0;
      int N = grid.length;
      
      for (int i = 0; i < N; i++) {
        maxRow = -1;
        maxCol = -1;
        for (int j = 0; j < N; j++) {
          if (grid[i][j] != 0) { // top view
            ans++;
          }         
          if (grid[i][j] > maxRow) { // side view
            maxRow = grid[i][j];
          }
          if (grid[j][i] > maxCol) { // front view
            maxCol = grid[j][i];
          }
        }
        ans += maxRow + maxCol;
      }
      return ans;
    }
}