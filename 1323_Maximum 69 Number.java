/**
 *  @author WasitShafi
 *  @since 23-SEP-2020
 */

class Solution {
  public int maximum69Number (int num) {
    int numCopy = num;
    int len = (int)Math.log10(num) + 1;
    int[] digits = new int[len];
    Boolean isSix = false;
    
    for (int i = len - 1; i >= 0; i--) {
      digits[i] = num % 10;
      num = num / 10;
      if (digits[i] == 6) {
        isSix = true;
      }
    }

    if (!isSix) {
      return numCopy;
    }
    for (int i = 0; i < len; i++) {
      if (digits[i] == 6) {
        digits[i] = 9;
        break;
      }
    }
    for (int i = 0; i < len; i++) {
      num = num * 10 + digits[i];
    }
  return num;
  }
}