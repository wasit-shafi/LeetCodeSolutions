/**
 *  @author WasitShafi
 *  @since  31-JUL-2021
 */
class Solution {
  public String restoreString(String s, int[] indices) {
    StringBuilder ans = new StringBuilder();
    
    if (indices.length == 0) {
      return "";
    }
    for (int i = 0; i < indices.length; i++) {
      ans.append("_");
    }
    for (int i = 0; i < indices.length; i++) {
       ans.replace(indices[i], indices[i] + 1, s.charAt(i) + "");
    }
    return ans.toString();
  }
}
