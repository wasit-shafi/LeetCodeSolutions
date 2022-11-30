
/*
 *  @author WasitShafi
 *  @since 25-AUG-20
 */

class Solution {
  public int findSpecialInteger(int[] arr) {
    int res = -1;
    int count = 0;
    int maxCount = 0;
    int len = arr.length;
    int i = 0;
  
    while (i < len) {
      i++;
      count = 1;
      while (i < len && arr[i - 1] == arr[i]) {
        count++;
        i++;
      }
      if (count > maxCount) {
        maxCount = count;
        res = arr[i - 1];
      }
    }
    return res;
  }
}