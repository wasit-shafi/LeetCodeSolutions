/**
 *  @author WasitShafi
 *  @since 17-OCT-2020
 */

class Solution {
  public boolean checkPerfectNumber(int num) {
    if (num < 2) {
     return false;
    } else {
      int sum = 1;
      
      for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
          sum += i;
          sum += num / i;
        }
      }
      return sum == num;
    }
  }
}