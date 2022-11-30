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
 *  @since 22-SEP-2020
 */

class Solution {
  public static int max(int x, int y) {
    return x > y ? x : y;
  }
  
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }
}