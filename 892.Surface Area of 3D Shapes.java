/**
 *  @author WasitShafi
 *  @since 08-OCT-2020
 */

class Solution {
  public int surfaceArea(int[][] grid) { // Ref: https://leetcode.com/problems/surface-area-of-3d-shapes/discuss/473235/892.-Surface-Area-of-3D-Shapes.-C%2B%2B-solution-with-visual-presentation
    int area = 0;
    int n = grid.length;
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 0) {
          continue;
        }
        area += (6 * grid[i][j]) - 2 * (grid[i][j] - 1); // total area - common area(top of each other)
        
        // It is necessary to subtract the common minimum area with next row/col, incase next row/clo is 0
        if (i < n - 1 &&  grid[i + 1][j] != 0) { // subtract common area with its next row if any
          area -= 2 * (grid[i][j] < grid[i + 1][j] ? grid[i][j] : grid[i + 1][j]);
        }
        
        if (j < n - 1 && grid[i][j + 1] != 0) { // subtract common area with its next column if any
          area -= 2 * (grid[i][j] < grid[i][j + 1] ? grid[i][j] : grid[i][j + 1]);
        }
      }
    }
    
    return area;
  }
}