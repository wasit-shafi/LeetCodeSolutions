/**
 * @author WasitShafi
 * @since 11-AUG-2025
 */

class Solution {
  public int compress(char[] chars) {
    int start = 0;
    int end = 0;
    int difference = 0;
    StringBuilder stringBuilder = new StringBuilder();

    while (end < chars.length) {
      end++;

      if (end < chars.length && chars[start] == chars[end]) {
        continue;
      }

      stringBuilder.append(Character.toString(chars[start]));
      difference = end - start;

      if (difference > 1) {
        stringBuilder.append(difference);
      }

      start = end;
    }

    for (int j = 0; j < stringBuilder.length(); j++) {
      chars[j] = stringBuilder.charAt(j);
    }

    return stringBuilder.length();
  }
}