/**
 *  @author WasitShafi
 *  @since 03-SEP-2020
 */

class Solution {
  public boolean threeConsecutiveOdds(int[] arr) {
    int count = 0;
    
    for (int item : arr) {
        if ((item & 1) == 1) {
          count++;
        } else {
          count = 0;
        }
        
        if (count == 3) {
          return true;
        }
    }
    return false;
  }
}