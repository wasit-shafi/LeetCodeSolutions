/**
 *  @author WasitShafi
 *  @since 22-AUG-2021
 */

class Solution {
  public String longestCommonPrefix(String[] strs) {
    int end = -1;
    
    mainLoop: for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
          break mainLoop;
        }
      }
      end = i;
    }
    return end == -1 ? "" : strs[0].substring(0,end + 1);
  }
}
