/*
 *  @author WasitShafi
 *  @since 25-AUG-20
 */

class Solution {
  public int findSpecialInteger(int[] arr) {
    int max = -1;
    int len = arr.length;
    Map<Integer, Integer> m = new HashMap<>();
    
    for (int i = 0; i < len; i++) {
      if (m.containsKey(arr[i])) {
        m.put(arr[i], m.get(arr[i]) + 1);
      } else {
        m.put(arr[i], 1);
      }
    }
    
    int key;
    int value;
    int element = -1;
    for (Map.Entry item : m.entrySet()) {
      key = (int)item.getKey();
      value = (int)item.getValue();
      if (value > max) {
        max = value;
        element = key;
      }
    }
    return element;
  }
}