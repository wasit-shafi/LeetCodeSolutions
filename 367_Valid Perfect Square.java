/**
 *  @author WasitShafi
 *  @since 03-OCT-2020
 */

class Solution {
  public boolean isPerfectSquare(int num) {
    long i;
    
    for (i = 0; i * i <= num; i++);
  
    i--;
    if (i * i == num) {
      return true;
    } else {
      return false;
    }
  }
}