/**
 * @author WasitShafi
 * @since 30-NOV-2022
 */
// Question:https://leetcode.com/problems/valid-sudoku/?envType=study-plan&id=data-structure-i
class Solution {
  public boolean isValidSudoku(char[][] board) {
    int noOfRows = board.length;
    int noOfColumns = board[0].length;
    Set<Character> rowDistinctElements = new HashSet<>();
    List<Set<Character>> columnsDistinctElements = new ArrayList<Set<Character>>();
    List<List<Set<Character>>> subBoxDistinctElements = new ArrayList<List<Set<Character>>>();

    // initialize sets for columns
    for (int i = 0; i < 9; i++) {
      columnsDistinctElements.add(new HashSet<Character>());
    }
    // initialize 2-D list of sets for sub-boxes
    for (int i = 0; i < 3; i++) {
      List<Set<Character>> list = new ArrayList<Set<Character>>();
      for (int j = 0; j < 3; j++) {
        list.add(new HashSet<Character>());
      }
      subBoxDistinctElements.add(list);
    }

    // traverse board
    for (int i = 0; i < noOfRows; i++) {
      for (int j = 0; j < noOfColumns; j++) {
        if (board[i][j] == '.') {
          continue;
        }
        if (rowDistinctElements.contains(board[i][j]) || columnsDistinctElements.get(j).contains(board[i][j])
            || subBoxDistinctElements.get(i / 3).get(j / 3).contains(board[i][j])) {
          return false;
        }
        rowDistinctElements.add(board[i][j]);
        columnsDistinctElements.get(j).add(board[i][j]);
        subBoxDistinctElements.get(i / 3).get(j / 3).add(board[i][j]);

      }
      rowDistinctElements.clear();
    }

    return true;
  }
}