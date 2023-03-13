/**
 * @author WasitShafi
 * @since 01-DEC-2022
 */
// Question:https://leetcode.com/problems/valid-anagram/?envType=study-plan&id=data-structure-i

class Solution {
  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> characterCount = new HashMap<Character, Integer>();

    if (s.length() != t.length()) {
      return false;
    }

    for (Character character : s.toCharArray()) {
      characterCount.put(character, characterCount.getOrDefault(character, 0) + 1);
    }

    for (Character character : t.toCharArray()) {
      if (characterCount.containsKey(character)) {
        characterCount.put(character, characterCount.get(character) - 1);
        if (characterCount.get(character) == 0) {
          characterCount.remove(character);
        }
      } else {
        return false;
      }
    }

    return characterCount.size() == 0;
  }
}