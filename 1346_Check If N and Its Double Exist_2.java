/**
 *  @author WasitShafi
 *  @since 12-SEP-2020
 */

class Solution {
  public boolean checkIfExist(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    
    for (Integer item : arr) {
      // find double or half of element is present or not
      if (set.contains(item * 2) || ((item & 1) == 0 && set.contains(item / 2))) {
        return true;
      }
      set.add(item);
    }
    return false;
  }
}