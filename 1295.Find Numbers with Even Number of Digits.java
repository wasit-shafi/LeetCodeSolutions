/**
 *  @author WasitShafi
 *  @since 04-SEP-2020
 */

class Solution {
  public int findNumbers(int[] nums) {
    int count = 0;
    
    for (int element : nums) {
      if ((((int)(Math.floor(Math.log10(element) + 1))) & 1) == 0) {
        count++;
      }
    }
    return count;
  }
}