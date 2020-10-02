/**
 *  @author WasitShafi
 *  @since 01-OCT-2020
 */

class Solution {
  public List<Integer> powerfulIntegers(int x, int y, int bound) {
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> arr = new ArrayList<>();
    
    if (x == 1 && y == 1) {
      if (bound >= 2) {
        set.add(2);
      }
    } else if (x == 1 || y == 1) {
      int i = 0;
      int notOne = x == 1 ? y : x;

      while ((int)(1 + Math.pow(notOne, i)) <= bound) {
        set.add((int)(1 + Math.pow(y, i)));
        i++;
      }
    } else {
      int i = 0;
      int j = 0;
      while ((int)(Math.pow(x, i) + Math.pow(y, 0)) <= bound) {
        j = 0;
        while ((int)(Math.pow(x, i) + Math.pow(y, j)) <= bound) {
          set.add((int)(Math.pow(x, i) + Math.pow(y, j)));
          j++;
        }
        i++;
      }
    }
    return new ArrayList(set);
  }
}