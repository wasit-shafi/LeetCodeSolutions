/**
 *  @author WasitShafi
 *  @since 25-SEP-2020
 */

class Solution {
  public int addDigits(int num) {
    int sum = 0;
    
    while (num > 9) {
      sum = 0;
      while (num != 0) {
        sum = sum + num % 10;
        num = num / 10;
      }
      num = sum;
    }
    return num;
  }
}