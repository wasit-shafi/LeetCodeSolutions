/**
 *  @author WasitShafi
 *  @since 13-SEP-2020
 */

class Solution {
  public int countOdds(int low, int high) {

    int ans = (high - low + 1) / 2;

    if ((low & 1) == 1 && (high & 1) == 1) {
      ans++;
    }

    return ans;
  }
}