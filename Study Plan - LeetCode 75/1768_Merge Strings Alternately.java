/**
 * @author WasitShafi
 * @since 11-JUL-2020
 */

class Solution {
  public String mergeAlternately(String word1, String word2) {
    int i = 0;
    int j = 0;
    int k = 0;
    StringBuilder output = new StringBuilder();

    while (i < word1.length() && j < word2.length()) {
      output.append(k++ % 2 == 0 ? word1.charAt(i++) : word2.charAt(j++));
    }

    while (i < word1.length()) {
      output.append(word1.charAt(i++));
    }

    while (j < word2.length()) {
      output.append(word2.charAt(j++));
    }

    return output.toString();
  }
}