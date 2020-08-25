/*
 *  @author WasitShafi
 *  @since 22-AUG-20
 */

class Solution {
    public int[] sortArrayByParity(int[] A) {
      int temp;
      int i = 0;
      int j = A.length - 1;
      
      while (i < j) {
        if (A[i] % 2 > A[j] % 2) {
          temp = A[i];
          A[i] = A[j];
          A[j] = temp;
        }
        
        if (A[i] % 2 == 0) {
          i++;
        }
        
        if (A[j] % 2 == 1) {
          j--;
        }
      }
    return A;
  }
}