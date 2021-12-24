/**
 *  @author WasitShafi
 *  @since 24-DEC-2021
 */
class Solution {
  public int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for (int i = 0; i < operations.length; i++) {
      if ("X++".equals(operations[i]) || "++X".equals(operations[i])) {
        x++;
      } else {
        --x;
      }
    }
    return x;
  }
}
