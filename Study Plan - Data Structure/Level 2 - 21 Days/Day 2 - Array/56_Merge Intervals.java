
// URL: https://leetcode.com/problems/merge-intervals/?envType=study-plan&id=data-structure-ii
/**
 * @author WasitShafi
 * @since 27-MAR-2023
 */
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
  public static void sortIntervals(int[][] intervals) {
    int[] temp;

    for (int i = 0; i < intervals.length - 1; i++) {
      for (int j = 0; j < intervals.length - i - 1; j++) {
        if (intervals[j][0] > intervals[j + 1][0]) {
          temp = intervals[j];
          intervals[j] = intervals[j + 1];
          intervals[j + 1] = temp;
        }
      }
    }
  }

  public static int[][] getPrimitiveArray(List<List<Integer>> list) {
    final int n = list.size();
    int[][] arr = new int[n][2];

    for (int i = 0; i < n; i++) {
      arr[i][0] = list.get(i).get(0);
      arr[i][1] = list.get(i).get(1);
    }
    return arr;
  }

  public int[][] merge(int[][] intervals) {
    int i = 0;
    int startInterval;
    int endInterval;
    List<List<Integer>> result = new ArrayList<>();

    sortIntervals(intervals);
    while (i < intervals.length) {
      startInterval = intervals[i][0];
      endInterval = intervals[i][1];
      while (i < intervals.length - 1
          && (intervals[i + 1][0] <= intervals[i][1] || endInterval >= intervals[i + 1][0])) {
        if (intervals[++i][1] > endInterval) {
          endInterval = intervals[i][1];
        }
      }
      result.add(Arrays.asList(startInterval, endInterval));
      i++;
    }

    return getPrimitiveArray(result);
  }
}