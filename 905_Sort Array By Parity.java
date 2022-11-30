/*
 *  @author WasitShafi
 *  @since 22-AUG-20
 */

class Solution {
    public int[] sortArrayByParity(int[] A) {
      int temp;
      int evenIndex = -1;
      int length = A.length;
      
      for (int i = 0 ; i < length ; i++) {
        if ((A[i] & 1) == 0) {
          temp = A[++evenIndex];
          A[evenIndex] = A[i];
          A[i] = temp;
        }
      }
    return A;
  }
}