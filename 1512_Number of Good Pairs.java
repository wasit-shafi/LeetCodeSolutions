/**
 *  @author WasitShafi
 *  @since 15-OCT-2020
 */
class Solution {
  public int numIdenticalPairs(int[] nums) {
    int f;
    int freq[];
    int sum = 0;
    int max = 0;
    int n = nums.length;
    
    for (int i = 0; i < n; i++) {
      if (nums[i] > max){
        max = nums[i];
      }
    }
    freq = new int[max + 1];
    
    for (int i = 0; i < n; i++) {
      freq[nums[i]]++;
    }
    
    for (int i = 1; i <= max; i++) {
      if (freq[i] > 1) {
        f = freq[i] - 1;
        sum += (f * (f + 1) / 2);
      }
    }
    
    return sum;
  }
}