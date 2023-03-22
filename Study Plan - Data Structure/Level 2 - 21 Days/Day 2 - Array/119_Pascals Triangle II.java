
// URL: https://leetcode.com/problems/pascals-triangle-ii/description/?envType=study-plan&id=data-structure-ii
// Getting WA from some cases
/**
 * @author WasitShafi
 * @since 21-MAR-2023
 */
import java.util.List;
import java.util.ArrayList;

class Solution {
  public List<Integer> getRow(int rowIndex) {
    int n = rowIndex;
    int[] factorials = new int[n + 1];
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i <= n; i++) {
      factorials[i] = i == 0 ? 1 : factorials[i - 1] * i;
    }

    for (int r = 0; r <= n; r++) {
      result.add(r == 0 | r == n ? 1 : factorials[n - 1] / (factorials[r - 1] * factorials[n - r - 1]));
    }

    return result;
  }
}
