/**
 *  @author WasitShafi
 *  @since 24-SEP-2020
 */

class Solution {
  public int findKthLargest(int[] nums, int k) {
    int length = nums.length;
    int max = Integer.MIN_VALUE;
    int prevMax = Integer.MAX_VALUE;
    int prevMaxIndex = -1;
    BitSet visitedIndex = new BitSet(length);
    
    for (int i = 0; i < k; i++) {
      max = Integer.MIN_VALUE; 
      for (int j = 0; j < length; j++) {
        if (!visitedIndex.get(j) && nums[j] <= prevMax && nums[j] >= max){
          max = nums[j];
          prevMaxIndex = j;
        }
      }
      prevMax = max;
      visitedIndex.set(prevMaxIndex);
    }
    return max;
  }
}