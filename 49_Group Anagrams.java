/**
 * @author WasitShafi
 * @since 18-JAN-2026
 */

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();
    String[] sortedStrs = new String[strs.length];

    for (int i = 0; i < strs.length; i++) {
      char[] arr = strs[i].toCharArray(); // string to char array
      Arrays.sort(arr);
      sortedStrs[i] = String.valueOf(arr); // back to sorted string
    }

    for (int i = 0; i < strs.length; i++) {
      if (map.containsKey(sortedStrs[i])) {
        map.get(sortedStrs[i]).add(strs[i]);
      } else {
        List<String> list = new ArrayList<>();
        list.add(strs[i]);
        map.put(sortedStrs[i], list);
      }
    }

    for (List<String> l : map.values()) {
      result.add(l);
    }
    return result;
  }
}