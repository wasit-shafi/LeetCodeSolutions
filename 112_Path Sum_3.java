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
  public boolean hasPathSum(TreeNode root, int sum) {
    
    if (root == null) { // Solved By Arjun
      return false;
    } else if (root.left == null && root.right == null && root.val == sum) {
      return true;
    } else {
      return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
  }
}