/**
 * @author WasitShafi
 * @since 14-FEB-2023
 */

class Solution {
  void updateSumAndCarryBits(char[] arr, char a, char b, char previousCarry) {
    if (a == '0' && b == '0') {
      if (previousCarry == '1') {
        arr[0] = '1'; // sum
        arr[1] = '0'; // next carry
      } else {
        arr[0] = '0'; // sum
        arr[1] = '0'; // next carry
      }
    } else if ((a == '0' && b == '1') || (a == '1' && b == '0')) {
      if (previousCarry == '1') {
        arr[0] = '0'; // sum
        arr[1] = '1'; // next carry
      } else {
        arr[0] = '1'; // sum
        arr[1] = '0'; // next carry
      }
    } else {
      if (previousCarry == '1') {
        arr[0] = '1'; // sum
        arr[1] = '1'; // next carry
      } else {
        arr[0] = '0'; // sum
        arr[1] = '1'; // next carry
      }
    }
  }

  public String addBinary(String a, String b) {

    char aBit;
    char bBit;
    char CarryBit = '0';
    char[] bitOperationResult = {'0', '0'};
    int aStringBitLength = a.length() - 1;
    int bStringBitLength = b.length() - 1;
    StringBuilder binaryResult = new StringBuilder("");

    while (aStringBitLength >= 0 || bStringBitLength >= 0) {
      aBit = aStringBitLength >= 0 ? a.charAt(aStringBitLength) : '0';
      bBit = bStringBitLength >= 0 ? b.charAt(bStringBitLength) : '0';
      updateSumAndCarryBits(bitOperationResult, aBit, bBit, CarryBit);
      binaryResult.insert(0, bitOperationResult[0]); // add at first the sum bit to final result
      CarryBit = bitOperationResult[1]; // save the next carry bit
      aStringBitLength--;
      bStringBitLength--;
    }

    if (previousCarryBit == '1') {
      binaryResult.insert(0, '1');
    }
    return binaryResult.toString();
  }
}