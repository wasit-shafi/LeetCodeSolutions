/**
 *  @author WasitShafi
 *  @since 08-OCT-2020
 */
class Solution {
  public double largestTriangleArea(int[][] points) {
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    int n = points.length;
    double area = 0;    
    double maxArea = Double.MIN_VALUE;
    
    for (int i = 0; i < n - 2; i++) {
      x1 = points[i][0];
      y1 = points[i][1];
      for (int j = i + 1; j < n - 1; j++) {
        x2 = points[j][0];
        y2 = points[j][1];
        for (int k = j + 1; k < n; k++) {
          x3 = points[k][0];
          y3 = points[k][1];
          area = Math.abs((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))) / 2.0;
          if (area > maxArea) {
            maxArea = area;
          }
        }
      }    
    }
    return maxArea;
  }
}