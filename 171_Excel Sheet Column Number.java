/**
 *  @author WasitShafi
 *  @since 17-SEP-2020
 */

class Solution { // Cloned ... :)
  public int titleToNumber(String s) {
    int sum = 0;
    int length = s.length();
    
    for (int i = 0 ; i < length; i++) {
      sum = sum * 26 + (s.charAt(i) - 'A' + 1);
    }
    
    return sum;
  }
}