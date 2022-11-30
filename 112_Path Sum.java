/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 *  @author WasitShafi
 *  @since 24-SEP-2020
 */

class Solution {
  public static boolean isFound = false;
  public static void check(TreeNode cur, int sum, int targetSum) {
    if (cur != null && isFound == false) {
      sum += cur.val;
      if (cur.left == null && cur.right == null && sum == targetSum) {
         isFound = true;
         return;
      }
      check(cur.left, sum, targetSum);
      check(cur.right, sum, targetSum);
    }
  }
  public boolean hasPathSum(TreeNode root, int sum) {
    isFound = false;
    check(root, 0, sum);
    return isFound;
  }
}