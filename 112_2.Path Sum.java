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
  public static boolean check(TreeNode cur, int sum, int targetSum) {
    if (cur == null) {
      return false;
    } else if (cur.left == null && cur.right == null && sum + cur.val == targetSum) {
      return true;
    } else {
      return check(cur.left, sum + cur.val, targetSum) || check(cur.right, sum+cur.val, targetSum);
    }
  }
  
  public boolean hasPathSum(TreeNode root, int sum) {
    return check(root, 0, sum);
  }
}