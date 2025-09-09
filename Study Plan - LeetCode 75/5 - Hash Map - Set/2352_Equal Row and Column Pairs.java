/**
 * @author WasitShafi
 * @since 09-SEP-2025
 */

class Solution {
  public int equalPairs(int[][] grid) {
    int total = 0;

    String rowString = "";
    String colString = "";

    StringBuilder rowStringBuilder = new StringBuilder("");
    StringBuilder colStringBuilder = new StringBuilder("");

    Map<String, Integer> rows = new HashMap<String, Integer>();
    Map<String, Integer> cols = new HashMap<String, Integer>();

    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid.length; c++) {
        rowStringBuilder.append(grid[r][c]);
        colStringBuilder.append(grid[c][r]);

        if (c + 1 < grid.length) {
          // NOTE: Adding separator to make sure the individual numbers are separate eg:
          // [[11,1],[1,11]] this should not get saved as 111
          rowStringBuilder.append(',');
          colStringBuilder.append(',');
        }
      }

      rowString = rowStringBuilder.toString();
      colString = colStringBuilder.toString();

      rows.put(rowString, rows.containsKey(rowString) ? rows.get(rowString) + 1 : 1);
      cols.put(colString, cols.containsKey(colString) ? cols.get(colString) + 1 : 1);

      rowStringBuilder.setLength(0);
      colStringBuilder.setLength(0);
    }

    for (String rowStr : rows.keySet()) {
      if (cols.containsKey(rowStr)) {
        total += rows.get(rowStr) * cols.get(rowStr);
      }
    }

    return total;
  }
}