/**
 *  @author WasitShafi
 *  @since 26-OCT-2020
 */

class Solution {
  public int[] distributeCandies(int candies, int num_people) {
    int i = 0;
    int[] result = new int[num_people];

    while (candies >= i + 1) {
      result[i % num_people] += i + 1;
      i++;
      candies -= i;
    }
    result[i % num_people] += candies;
    return result;
  }
}
