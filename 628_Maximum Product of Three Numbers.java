/**
 *  @author WasitShafi
 *  @since 27-OCT-2020
 */

class Solution {
  public int maximumProduct(int[] nums) {
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int max3 = Integer.MIN_VALUE;
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;

    for (Integer element : nums) {
      if (element > max1) {
        max3 = max2;
        max2 = max1;
        max1 = element;
      } else if (element > max2) {
        max3 = max2;
        max2 = element;
      } else if (element > max3) {
        max3 = element;
      }

      if (element  < min1) {
        min2 = min1;
        min1 = element;
      } else if (element < min2) {
        min2 = element;
      }
    }
    // Answer may have be multiplication of highest three numbers, since array contain negative numbers as well and we know if two negative numbers are multiplied, result will be a positive numbers, so we have to do extra check
    return (max1 * max2 * max3) > (min1 * min2 * max1) ? (max1 * max2 * max3) : (min1 * min2 * max1);
  }
}
