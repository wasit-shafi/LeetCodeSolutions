/**
 * @author WasitShafi
 * @since 29-NOV-2022
 */
// Question:https://leetcode.com/problems/pascals-triangle/?envType=study-plan&id=data-structure-i

class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < numRows; i++) {
      List<Integer> temp = new ArrayList<Integer>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          temp.add(1);
        } else {
          temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
        }
      }
      result.add(temp);
    }
    return result;
  }
}