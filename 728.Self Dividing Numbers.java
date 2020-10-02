/**
 *  @author WasitShafi
 *  @since 25-SEP-2020
 */

class Solution {
  public static boolean isSelfDividing(int n) {
    if (n % 10 == 0) {
      return false;
    } else {
      int num = n;
      while (n != 0) {
        if ((n % 10 == 0) || (num % (n % 10) != 0)) {
          return false;
        }
        n = n / 10;
      }
    }
    return true;
  }
  
  public List<Integer> selfDividingNumbers(int left, int right) {
    ArrayList<Integer> arr = new ArrayList<>();
    
    for (int i = left; i <= right; i++) {
      if (isSelfDividing(i)) {
        arr.add(i);
      }
    }
    return arr;
  }
}