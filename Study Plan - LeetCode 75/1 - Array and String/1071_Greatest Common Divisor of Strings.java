/**
 * @author WasitShafi
 * @since 23-JUL-2025
 */

// Ref: https://www.youtube.com/watch?v=3ZuLKFPsYv8

class Solution {
  public static int getGcd(int a, int b) {
    int rem = a % b;

    return rem == 0 ? b : getGcd(b, rem);
  }

  public String gcdOfStrings(String str1, String str2) {
    return (str1 + str2).equals(str2 + str1) ? str1.substring(0, getGcd(str1.length(), str2.length())) : "";
  }
}