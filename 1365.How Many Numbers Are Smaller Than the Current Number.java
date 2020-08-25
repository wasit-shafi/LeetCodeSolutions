/*
 *  @author WasitShafi
 *  @since 23-AUG-20
 */

class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int len = nums.length;
    int res[] = new int[len];
    int max = Arrays.stream(nums).max().getAsInt();
    int freq[] = new int[max + 1];
    int prefixSum[] = new int[max + 1];
    
    for (int i = 0 ; i < len ; i++) {
      freq[nums[i]]++;
    }
    
    prefixSum[0] = freq[0];
    for (int i = 1; i < max + 1 ; i++) {
      prefixSum[i] = prefixSum[i - 1] + freq[i];
    }
    
    for (int i = 0 ; i < len ; i++) { 
      res[i] = prefixSum[nums[i]] - freq[nums[i]];
    }
    return res;
  }
}