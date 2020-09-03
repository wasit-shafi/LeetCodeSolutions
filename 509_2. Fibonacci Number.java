/**
 *  @author WasitShafi
 *  @since 31-AUG-2020
 */

class Solution {
  public int fib(int N) {
    return (int)(((Math.pow(1 + Math.sqrt(5), N)) - (Math.pow(1 - Math.sqrt(5), N))) / (Math.pow(2, N) * Math.sqrt(5))); 
  }
}