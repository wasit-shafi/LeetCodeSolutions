/**
 *  @author WasitShafi
 *  @since 17-SEP-2020
 */

class Solution {
  public int titleToNumber(String s) {
    int sum = 0;
    int length = s.length();
    
    for (int i = length - 1; i >= 0; i--) {
      sum += (int)Math.pow(26, length - i - 1) * (s.charAt(i) - 'A' + 1);
    }
    
    return sum;
  }
}