/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

class Solution {
  public String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder ans = new StringBuilder("");
        
    for (int i = words.length - 1; i>=0; i--) {
      if (!words[i].equals("")) {
        ans.append(words[i]);
        if (i != 0) {
          ans.append(" ");
        }
      }
    }
    
    return ans.toString().trim();
  }
}