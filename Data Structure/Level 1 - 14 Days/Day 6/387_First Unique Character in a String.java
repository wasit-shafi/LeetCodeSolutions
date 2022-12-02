/**
 * @author WasitShafi
 * @since 01-DEC-2022
 */
// Question:https://leetcode.com/problems/first-unique-character-in-a-string/?envType=study-plan&id=data-structure-i

class Solution {
  public int firstUniqChar(String s) {
    Map<Character, Integer> characterCount = new HashMap<Character, Integer>();

    for (int i = 0; i < s.length(); i++) {
      characterCount.put(s.charAt(i), characterCount.getOrDefault(s.charAt(i), 0) + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (characterCount.getOrDefault(s.charAt(i), 0) == 1) {
        return i;
      }
    }

    return -1;
  }
}