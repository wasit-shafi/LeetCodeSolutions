/**
 *  @author WasitShafi
 *  @since 23-OCT-2020
 */
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */
class Solution {
  public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
    int x;
    int y;
    List<List<Integer>> allPairs = new ArrayList<>();

    x = 1;
    while (customfunction.f(x, 1) <= z) {
      y = 1;
      while (customfunction.f(x, y) <= z) {
        if (customfunction.f(x, y) == z) {
          List<Integer> pair = new ArrayList<>();
          pair.add(x);
          pair.add(y);
          allPairs.add(pair);
        }
        y++;
      }
      x++;
    }
    return allPairs;
  }
}
