/**
 * @author WasitShafi
 * @since 14-FEB-2023
 */

class Solution {
  public int countOdds(int low, int high) {
    int totalTerms = high - low + 1;
    int countOdd = totalTerms / 2;

    if (low == high && low % 2 != 0) {
      return 1;
    }
    if (totalTerms > 2 && totalTerms % 2 != 0 && low % 2 != 0) {
      countOdd++;
    }
    return countOdd;
  }
}