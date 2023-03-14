
// URL: https://leetcode.com/problems/design-hashmap/?envType=study-plan&id=data-structure-ii
/**
 * @author WasitShafi
 * @since 14-MAR-2023
 */
import java.util.List;
import java.util.ArrayList;

class MyHashMap {
  private final List<Integer> keys;
  private final List<Integer> values;

  public MyHashMap() {
    keys = new ArrayList<Integer>();
    values = new ArrayList<Integer>();
  }

  public void put(int key, int value) {
    int index = keys.indexOf(key);
    if (index != -1) {
      values.set(index, value);
    } else {
      keys.add(key);
      values.add(value);
    }
  }

  public int get(int key) {
    int index = keys.indexOf(key);
    return index != -1 ? values.get(index) : index;
  }

  public void remove(int key) {
    int index = keys.indexOf(key);
    if (index != -1) {
      keys.remove(index);
      values.remove(index);
    }
  }
}