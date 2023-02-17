/**
 * @author WasitShafi
 * @since 18-OCT-2020
 */

class Solution {
  public char getAnd(char a, char b) {
    return (a == '1' && b == '1') ? '1' : '0';
  }

  public char getOr(char a, char b) {
    return (a == '0' && b == '0') ? '0' : '1';
  }

  public char getXor(char a, char b) {
    return (a == b) ? '0' : '1';
  }

  public char getSum(char a, char b, char c) {
    return getXor(a, getXor(b, c)); // sum = a (+) b (+) c
  }

  public char getCarry(char a, char b, char c) {
    return getOr(getAnd(a, b), getOr(getAnd(b, c), getAnd(c, a))); // carry = ab + bc + ca
  }

  public String addBinary(String a, String b) {
    char sum;
    char carry = '0';
    int i = a.length() - 1;
    int j = b.length() - 1;
    StringBuilder ans = new StringBuilder("");

    while (i >= 0 && j >= 0) {
      ans.append(getSum(a.charAt(i), b.charAt(j), carry));
      carry = getCarry(a.charAt(i), b.charAt(j), carry);
      i--;
      j--;
    }

    while (i >= 0) {
      ans.append(getXor(a.charAt(i), carry));
      carry = getAnd(a.charAt(i), carry);
      i--;
    }
    while (j >= 0) {
      ans.append(getXor(b.charAt(j), carry));
      carry = getAnd(b.charAt(j), carry);
      j--;
    }

    if (carry == '1') {
      ans.append(carry);
    }

    return ans.reverse().toString();
  }
}