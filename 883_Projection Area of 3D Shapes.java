/**
 *  @author WasitShafi
 *  @since 16-SEP-2020
 */

class Solution {
    public int projectionArea(int[][] grid) {
      int max;
      int ans = 0;
      int N = grid.length;
      
      for (int i = 0; i < N; i++) {  // Top View
        for (int j = 0; j < N; j++) {
          if (grid[i][j] != 0) {
            ans++;
          }
        }
      }
      
      for (int i = 0; i < N; i++) { // side View (Row Wise)
        max = grid[i][0];
        for (int j = 1; j < N; j++) {
          if (grid[i][j] > max) {
            max = grid[i][j];
          }
        }
        ans += max;
      }
      
      for (int i = 0; i < N; i++) { // front View (Col Wise)
        max = grid[0][i];
        for (int j = 1; j < N; j++) {
          if (grid[j][i] > max) {
            max = grid[j][i];
          }
        }
        ans += max;
      }
      
      return ans;
    }
}