/**
 * @author WasitShafi
 * @since 06-SEP-2020
 */

class Solution {
  public List<Integer> addToArrayForm(int[] A, int K) {
    List<Integer> ans = new ArrayList<>();

    for (int i = A.length - 1; i >= 0; i--, K /= 10) {
      K += A[i];
      ans.add(K % 10);
    }

    while (K != 0) {
      ans.add(K % 10);
      K /= 10;
    }
    Collections.reverse(ans);
    return ans;
  }
}