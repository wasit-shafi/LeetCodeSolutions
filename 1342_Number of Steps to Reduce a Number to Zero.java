/**
 *  @author WasitShafi
 *  @since  01-AUG-2021
 */
class Solution {
  public int numberOfSteps(int num) {
    int ans = 0;   
    while (num != 0) {
      num = num % 2 == 0 ? num / 2 : --num;
      ans++;
    }
    return ans;
  }
}
