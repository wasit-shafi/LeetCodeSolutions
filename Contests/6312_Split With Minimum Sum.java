/**
 * @author WasitShafi
 * @since 04-MAR-2023
 */
// URL:
// https://leetcode.com/contest/biweekly-contest-99/problems/split-with-minimum-sum/
class Solution {
  public int splitNum(int num) {
    int num1 = 0;
    int num2 = 0;
    int index = 0;
    int noOfDigitsInNum = (int) Math.floor(Math.log10(num)) + 1;
    int[] digits = new int[noOfDigitsInNum];

    while (num != 0) {
      digits[index++] = num % 10;
      num = num / 10;
    }
    Arrays.sort(digits);

    for (int i = 0; i < noOfDigitsInNum; i++) {
      if ((i & 1) == 0) {
        num1 = num1 * 10 + digits[i];
      } else {
        num2 = num2 * 10 + digits[i];
      }
    }
    return num1 + num2;
  }
}