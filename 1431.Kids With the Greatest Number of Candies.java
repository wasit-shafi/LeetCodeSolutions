/**
 *  @author WasitShafi
 *  @since  31-JUL-2021
 */
class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int n = candies.length;
    int max = Integer.MIN_VALUE;
    List<Boolean> result = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      if (candies[i] > max) {
        max = candies[i];
      }
    }
    for (int i = 0; i < n; i++) {
      result.add(candies[i] + extraCandies >= max); 
    }
    return result;
  }
}
