/**
 *  @author WasitShafi
 *  @since 29-AUG-2020
 */

class Solution { // Time Complexity : O(N^2)
  public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    int j;
    int distance = 0;
    int len1 = arr1.length;
    int len2 = arr2.length;
    
    for (int i = 0; i < len1; i++) {
      for (j = 0; j < len2; j++) {
        if(Math.abs(arr1[i] - arr2[j]) <= d)
          break;
      }
      if(j == len2) {
        distance++;
      }
    }
    
    return distance;
  }
}