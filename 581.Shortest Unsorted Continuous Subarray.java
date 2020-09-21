class Solution {
  public int getMinIndex(int[] nums, int left, int right) {
    int minIndex = left;
    
    for (int i = left + 1; i <= right; i++) {
      if (nums[i] < nums[minIndex]) {
        minIndex = i;
      }
    }
    return minIndex;
  }
  
  public int getMaxIndex(int[] nums, int left, int right) {
    int maxIndex = left;
    
    for (int i = left + 1; i <= right; i++) {
      if (nums[i] > nums[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }
  
  public int findUnsortedSubarray(int[] nums) {
    int length = nums.length;
    int left;
    int right;
    
    left = 0;
    if(length == 1) {
      return 0;
    }
    while((left < length - 1 && nums[left] <= nums[left + 1]) ) {
      left++;
    }
    
    right = length - 1;
    while((right > 0 && nums[right] >= nums[right - 1])) {
      right--;
    }
     //System.out.println("#1 left : " + left + "   right : " + right);
    if (left == 0 && right == length - 1) {
      return length;
    } else if (left == length - 1 && right == 0) {
      return 0;
    } else {
      
      
      if(left != length -1 && left + 1 != right) {
        left++;
      }
      if (right != 0 && right -1 != left) {
        right--;
      }
      
      //System.out.println("#1 left : " + left + "   right : " + right);
      int minIndex = getMinIndex(nums, left, right);
      int maxIndex = getMaxIndex(nums, left, right);
      //System.out.println("#2 left : " + left + "   right : " + right + "minindex : " + minIndex + "   maxIndex : " +  maxIndex + "min : " + nums[minIndex] + "   max : " + nums[maxIndex]);
      
      while (left -1 > 0 && nums[left - 1] > nums[minIndex]) {
        left--;
      }
      while (right + 1 < length && nums[right + 1] < nums[maxIndex]) {
        right++;;
      }
//      System.out.println("#3 left : " + left + "   right : " + right + "minindex : " + minIndex + "   maxIndex : " +  maxIndex + "   max : " + nums[maxIndex]);

      return right - left + 1;
    }
  }
}