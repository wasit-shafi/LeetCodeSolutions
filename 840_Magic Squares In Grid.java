/**
 *  @author WasitShafi
 *  @since 30-AUG-2020
 */

class Solution {
  public int numMagicSquaresInside(int[][] grid) {
    int k;
    int ans = 0;
    int n = grid.length;
    int rowSum = -1;
    int colSum = -2;
    int primaryDiagonalSum = -3;
    int secondaryDiagonalSum = -4;
    boolean[] temp = new boolean[16];
    
    for (int i = 0; i + 2 < n; i++) {
      for (int j = 0; j + 2 < n; j++) {
        Arrays.fill(temp, false);
        temp[grid[i][j]] = true;
        temp[grid[i][j + 1]] = true;
        temp[grid[i][j + 2]] = true;

        temp[grid[i + 1][j]] = true;
        temp[grid[i + 1][j + 1]] = true;
        temp[grid[i + 1][j + 2]] = true;

        temp[grid[i + 2][j]] = true;
        temp[grid[i + 2][j + 1]] = true;
        temp[grid[i + 2][j + 2]] = true;
        
        for (k = 1; j <= 9; k++) {
          if (temp[k] == false) {
            break;
          }
        }
        
        if(k == 10)
        {
          rowSum = grid[i][j] + grid[i][j + 1]  + grid[i][j + 2];
          if(rowSum != 15) {
            continue;
          }
        
          colSum = grid[i][j] + grid[i + 1][j] + grid[i + 2][j];
          if(colSum != 15) {
            continue;
          }
          primaryDiagonalSum  = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
          if(primaryDiagonalSum != 15) {
            continue;
          }
          secondaryDiagonalSum  = grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j];
          if(secondaryDiagonalSum == 15) {
            ans++;
          }
        }
      }
    }
    return ans;
  }
}