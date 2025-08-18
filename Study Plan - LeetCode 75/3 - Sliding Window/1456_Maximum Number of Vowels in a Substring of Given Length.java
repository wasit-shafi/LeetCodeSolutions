/**
 * @author WasitShafi
 * @since 19-AUG-2025
 */

class Solution {
  public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }

  public int maxVowels(String s, int k) {
    int i = 0;
    int vowelCount = 0;
    int maxVowelCount = 0;

    while (i < k) {
      if (isVowel(s.charAt(i++))) {
        vowelCount++;
      }
    }

    maxVowelCount = vowelCount;

    while (i < s.length()) {
      if (isVowel(s.charAt(i))) {
        vowelCount++;
      }
      if (isVowel(s.charAt(i - k))) {
        vowelCount--;
      }

      if (vowelCount > maxVowelCount) {
        maxVowelCount = vowelCount;
      }

      i++;
    }

    return maxVowelCount;
  }
}