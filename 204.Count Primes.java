/**
 *  @author WasitShafi
 *  @since 15-OCT-2020
 */

class Solution {
  public int countPrimes(int n) {
    int count = 0;
    boolean[] arr = new boolean[n + 1];
    
    if (n < 2) {
      return 0;
    }
    arr[0] = true;
    arr[1] = true;
    for (int i = 0; i * i <= n; i++) {
      if (arr[i] == false) {
        for (int j = i * i; j <= n; j = j + i) {
          arr[j] = true;
        }
      }
    }
    
    for (int i = 0; i < n; i++) {
      if (arr[i] == false) {
        count++;
      }
    }
    
    return count;
  }
}