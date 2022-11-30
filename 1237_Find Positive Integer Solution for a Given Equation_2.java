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
    int value;
    int low = 1;
    int high = 1000;
    List<List<Integer>> allPairs = new ArrayList<>();

    while (low <= 1000 && high >= 1) {
      value = customfunction.f(low, high);
      if (value == z) {
        List<Integer> pair = new ArrayList<>();
        pair.add(low);
        pair.add(high);
        allPairs.add(pair);
        low++;
        high--;
      } else if (value < z) {
        low++;
      } else {
        high--;
      }
    }

    return allPairs;
  }
}
