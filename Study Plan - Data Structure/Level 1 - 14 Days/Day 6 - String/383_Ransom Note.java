/**
 * @author WasitShafi
 * @since 01-DEC-2022
 */
// Question:https://leetcode.com/problems/ransom-note/?envType=study-plan&id=data-structure-i
class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> characterCount = new HashMap<Character, Integer>();

    for (Character character : magazine.toCharArray()) {
      if (characterCount.containsKey(character)) {
        characterCount.put(character, characterCount.get(character) + 1);
      } else {
        characterCount.put(character, 1);
      }
    }

    for (Character character : ransomNote.toCharArray()) {
      if (characterCount.containsKey(character)) {
        if (characterCount.get(character) == 1) {
          characterCount.remove(character);
        } else {
          characterCount.put(character, characterCount.get(character) - 1);
        }
      } else {
        return false;
      }
    }

    return true;
  }
}