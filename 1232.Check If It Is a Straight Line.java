/**
 *  @author WasitShafi
 *  @since 21-SEP-2020
 */

class Solution {
  public boolean checkStraightLine(int[][] coordinates) {
    double slope = 0.0;
    Boolean isVerticalLine = false;
    int length = coordinates.length;
    int y = (coordinates[1][1] - coordinates[0][1]);
    int x = (coordinates[1][0] - coordinates[0][0]);
    
    if (x != 0) {
      slope = (double)y / x;
    } else {
      isVerticalLine = true; // slope = infinity
    }
    
    for (int i = 2; i < length; i++) {
      y = coordinates[i][1] - coordinates[i - 1][1];
      x = coordinates[i][0] - coordinates[i - 1][0];      
      if (isVerticalLine == true)
      {
        if(x != 0) {
          return false;
        }
      } else if (x == 0 || (double)y / x !=  slope) {
        return false;
      }
    }
    return true;
  }
}