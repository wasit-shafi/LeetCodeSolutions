/**
 * @author WasitShafi
 * @since 17-JUL-2020
 */

class Solution {

  public String reverseVowels(String s) {
    int start = 0;
    int end = s.length() - 1;
    String VOWELS = "aeiou";
    StringBuilder result = new StringBuilder(s);
    Character tempChar = ' ';

    while (start < end) {
      while (start < end && !VOWELS.contains(String.valueOf(Character.toLowerCase(s.charAt(start))))) {
        start++;
      }

      while (start < end && !VOWELS.contains(String.valueOf(Character.toLowerCase(s.charAt(end))))) {
        end--;
      }

      if (start < end) {
        tempChar = result.charAt(start);
        result.setCharAt(start, result.charAt(end));
        result.setCharAt(end, tempChar);
      }

      start++;
      end--;
    }

    return result.toString();
  }
}