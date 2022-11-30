/**
 *  @author WasitShafi
 *  @since 21-SEP-2020
 */

class Solution {

  public int minCostToMoveChips(int[] position) {
    int odd = 0;
    int even = 0;
    
    for (Integer item : position) {
      if ((item & 1) == 1) {
        odd++;
      } else {
        even++;
      }
    }
    // we know with no cost all even position index and all odd position index coins will be adjacent to each other, then we just need to find minimum among them
    return odd < even ? odd : even;
  }
}