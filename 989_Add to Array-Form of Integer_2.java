/**
 * @author WasitShafi
 * @since 15-FEB-2020
 */
class Solution {

  public static List<Integer> addToArrayForm(int[] A, int K) {
    List<Integer> result = new ArrayList<>();
    int i = A.length - 1;
    int previousCarryDigit = 0;
    int arrayDigit;
    int kLastDigit;
    int sum;

    while (i >= 0 || K != 0) {
      arrayDigit = i >= 0 ? A[i] : 0;
      kLastDigit = K != 0 ? K % 10 : 0;
      sum = arrayDigit + kLastDigit + previousCarryDigit;
      result.add(0, sum % 10);
      previousCarryDigit = sum / 10;
      K = K / 10;
      i--;
    }

    if (previousCarryDigit != 0) {
      result.add(0, previousCarryDigit);
    }
    return result;
  }
}