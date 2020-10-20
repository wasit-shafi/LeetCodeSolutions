/**
 *  @author WasitShafi
 *  @since 09-OCT-2020
 */

class Solution {
  public int maxCount(int m, int n, int[][] ops) {
    int r;
    int c;
    int sum;
    int count;
    int length = ops.length;
    int max = Integer.MIN_VALUE;
    int[][] arr = new int[m][n];
    
    for (int i = 0; i < length; i++) {
      r = ops[i][0];
      c = ops[i][1];
      for (int j = 0; j < r; j++) {
        arr[j][0] += 1;
        if (c != n) {
          arr[j][c] += -1;
        }
      }
    }

    // prefix sum
    for (int i = 0; i < m; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] += arr[i][j - 1];
      }
    }
    
    // get max Element
    max = Integer.MIN_VALUE;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }
 
    // count frequency of maxsum
    count = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] == max) {
          count++;
        }
      }
    }
    return count;
  }
}