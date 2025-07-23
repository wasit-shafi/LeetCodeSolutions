/**
 * @author WasitShafi
 * @since 17-JUL-2020
 */

class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = candies[0];
    List result = new ArrayList<Boolean>(candies.length);

    for (int i = 1; i < candies.length; i++) {
      if (candies[i] > max) {
        max = candies[i];
      }
    }

    for (int i = 0; i < candies.length; i++) {
      result.add(candies[i] + extraCandies >= max ? true : false);
    }

    return result;

  }
}