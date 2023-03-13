
// URL: https://leetcode.com/problems/single-number/description/?envType=study-plan&id=data-structure-ii
/**
 * @author WasitShafi
 * @since 10-MAR-2023
 */
class Solution {
  public int singleNumber(int[] nums) {
    int result = 0;
    int MAX_SIZE = 3 * (int) Math.pow(10, 4);
    int TOTAL_SIZE = MAX_SIZE * 2 + 1;
    boolean[] numOccurrence = new boolean[TOTAL_SIZE];

    for (int n : nums) {
      numOccurrence[n + MAX_SIZE] = !numOccurrence[n + MAX_SIZE];
    }
    for (int i = 0; i < numOccurrence.length; i++) {
      if (numOccurrence[i] == true) {
        result = i < MAX_SIZE ? -(MAX_SIZE - i) : i - MAX_SIZE;
        break;
      }
    }
    return result;
  }
}