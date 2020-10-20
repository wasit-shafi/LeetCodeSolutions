
/**
 *  @author WasitShafi
 *  @since 01-OCT-2020
 */

class Solution { // TLE for input : 7611
  public static String getFactorial(int n) {
    java.math.BigInteger fact = new java.math.BigInteger("1");
    
    while (n != 0) {
      fact = fact.multiply(java.math.BigInteger.valueOf(n));
      n--;
    }
    return fact.toString();
  }
  
  public static int countTrallingZeros(String str) {
    int count = 0;

    for (int i = str.length() - 1; i >= 0 && str.charAt(i) == '0'; i--) {
      count++;
    }
    return count;
  }
  
  public int trailingZeroes(int n) {  
    return countTrallingZeros(getFactorial(n));
  }
}