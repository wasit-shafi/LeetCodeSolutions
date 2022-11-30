/**
 *  @author WasitShafi
 *  @since  31-JUL-2021
 */
class Solution {
    public int[] decode(int[] encoded, int first) {
      int ans[] = new int[encoded.length + 1];
      
      //Checked leetcode hint1: Since that encoded[i] = arr[i] XOR arr[i+1], then arr[i+1] = encoded[i] XOR arr[i].
      ans[0] = first;
      for (int i = 0; i < encoded.length; i++) {
        ans[i + 1] = ans[i] ^ encoded[i];
      }
      return ans;
    }
}
