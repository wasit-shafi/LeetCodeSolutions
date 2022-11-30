/**
 * @author WasitShafi
 * @since 26-NOV-2022
 */
// Question:https://leetcode.com/contest/biweekly-contest-92/problems/minimum-cuts-to-divide-a-circle/
class Solution {
  public int numberOfCuts(int n) {
    // special case, incase of only 1 piece we don't have to make a cut circle
    if (n == 1) {
      return 0;
    }

    if (n % 2 == 0) {
      return n / 2;
    } else {
      return n;
    }
  }
}