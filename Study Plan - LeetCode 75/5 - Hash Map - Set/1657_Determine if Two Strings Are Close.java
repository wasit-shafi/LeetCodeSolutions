/**
 * @author WasitShafi
 * @since 01-Sept-2025
 */
// Ref: https://www.youtube.com/watch?v=KbdCp4nUDiQ

class Solution {
  public boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }
    int[] countArr1 = new int[26];
    int[] countArr2 = new int[26];

    for (int i = 0; i < word1.length(); i++) {
      countArr1[word1.charAt(i) - 'a']++;
    }

    for (int i = 0; i < word2.length(); i++) {
      countArr2[word2.charAt(i) - 'a']++;
    }

    for (int i = 0; i < countArr1.length; i++) {
      if ((countArr1[i] == 0 && countArr2[i] != 0) || (countArr1[i] != 0 && countArr2[i] == 0)) {
        return false;
      }
    }

    Map<Integer, Integer> frequenciesCount = new HashMap<Integer, Integer>();
    for (Integer num : countArr1) {
      if (num > 0) {
        if (frequenciesCount.containsKey(num)) {
          frequenciesCount.put(num, frequenciesCount.get(num) + 1);
        } else {
          frequenciesCount.put(num, 1);
        }
      }
    }

    for (Integer num : countArr2) {
      if (num > 0) {
        if (frequenciesCount.containsKey(num)) {
          frequenciesCount.put(num, frequenciesCount.get(num) - 1);
        } else {
          return false;
        }
      }
    }

    for (Integer num : frequenciesCount.values()) {
      if (num > 0) {
        return false;
      }
    }

    return true;
  }
}