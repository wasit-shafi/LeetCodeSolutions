/**
 *  @author WasitShafi
 *  @since 12-SEP-2020
 */

class Solution {
  public boolean checkIfExist(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int zeroCount = 0;
    for (Integer item : arr) {
      if (item == 0) {
        zeroCount++;
      } else {
        set.add(item);
      }
    }
    
    for (Integer item : arr) {
      if ((item == 0 && zeroCount > 1) || set.contains(item * 2)) {
        return true;
      }
    }
    return false;
  }
}