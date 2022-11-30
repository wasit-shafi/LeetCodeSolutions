/**
 *  @author WasitShafi
 *  @since 16-OCT-2021
 */

class Solution {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    
    // check if last digit is not 0
    if (digits[n - 1] != 9) {
      digits[n - 1]++;
      return digits;
    }
    
    // do increment by 1
    n--;
    while (n >= 0) {
      if (digits[n] != 9) {
        digits[n]++;
        break;
      } else {
        digits[n] = 0;
      }
      n--;
    }
    // check if all are 0
    if (digits[0] != 0) {
      return digits;
    }
    // digits was 99999...9
    int[] newDigits = new int [digits.length + 1];
    newDigits[0] = 1;
    return newDigits;
  }
}
