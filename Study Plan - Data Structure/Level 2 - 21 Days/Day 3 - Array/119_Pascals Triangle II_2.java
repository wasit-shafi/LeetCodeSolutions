
// URL: https://leetcode.com/problems/pascals-triangle-ii/description/?envType=study-plan&id=data-structure-ii
// Referred: https://www.youtube.com/watch?v=LgLcWJrfLmQ
/**
 * @author WasitShafi
 * @since 21-MAR-2023
 */
import java.util.List;
import java.util.ArrayList;

class Solution {
  public List<Integer> getRow(int n) {
    long previousTerm = 1l; // to avoid overflow
    List<Integer> result = new ArrayList<>();

    result.add((int) previousTerm);
    // the next term will be = previousTerm * (i-j) / (j+1), where i is the row no,
    // j is the column/jth element of that row
    for (int r = 0; r < n; r++) {
      previousTerm = previousTerm * (n - r) / (r + 1);
      result.add((int) previousTerm);
    }

    return result;
  }
}
