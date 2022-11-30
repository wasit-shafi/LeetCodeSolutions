/**
 *  @author WasitShafi
 *  @since 10-OCT-2020
 */

class Solution {
  public boolean judgeSquareSum(int c) {
    HashSet<Long> squares = new HashSet<>();
    
    for (Long i = 0L; i * i <= c; i++) {
      squares.add(i * i);
    }
    
    for (Long i = 0L; i * i <= c; i++) {
      if (squares.contains(c - (i * i))) {
        return true;
      }
    }
    return false;
  }
}