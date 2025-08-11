/**
 * @author WasitShafi
 * @since 12-AUG-2025
 */

class Solution {
  public boolean isSubsequence(String s, String t) {
    if (s.length() > t.length()) {
      return false;
    } else if (s.length() == 0) {
      return true;
    }
    int i = 0;

    for (int j = 0; j < t.length(); j++) {
      if (i == s.length()) {
        return true;
      } else if (t.charAt(j) == s.charAt(i)) {
        i++;
      }
    }

    return i == s.length();
  }
}