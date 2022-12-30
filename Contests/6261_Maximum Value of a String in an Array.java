/**
 * @author WasitShafi
 * @since 10-DEC-2022
 */
// Question: https://leetcode.com/contest/biweekly-contest-93/problems/maximum-value-of-a-string-in-an-array/

class Solution {
  public int maximumValue(String[] strs) {
    int max = Integer.MIN_VALUE;
    for (String str : strs) {
      if (str.matches("[0-9.]+")) {
        max = Integer.valueOf(str) > max ? Integer.valueOf(str) : max;
      } else {
        max = str.length() > max ? str.length() : max;
      }
    }
    return max;
  }
}