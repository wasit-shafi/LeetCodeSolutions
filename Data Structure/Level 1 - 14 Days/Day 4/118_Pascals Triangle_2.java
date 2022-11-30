
// on hold
/**
 * @author WasitShafi
 * @since 29-NOV-2022
 */
// Question:https://leetcode.com/problems/pascals-triangle/?envType=study-plan&id=data-structure-i

class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    for (int i = 0; i < numRows; i++) {
      int j = 0;
      List<Integer> temp = new ArrayList<Integer>();

      while (j < i / 2 + 1) {
        if (j == 0) {
          temp.add(1);
        } else {
          temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
        }
        j++;
      }
      j--;

      if (i % 2 == 0) {
        j--;
      }
      while (j >= 0 && i > 0) {
        temp.add(temp.get(j));
        j--;
      }
      result.add(temp);
    }

    return result;
  }
}