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
 *  @since 07-OCT-2020
 */

class Solution {
  public static int min(int x, int y) {
    return x < y ? x : y;
  }
  
  public int minDepth(TreeNode root) {
    if (root == null) { // only if tree is empty
      return 0;
    } else if (root.left == null && root.right == null) {
      return 1;
    } else if (root.left == null) {
      return minDepth(root.right) + 1;
    } else if (root.right == null) {
      return minDepth(root.left) + 1;
    } else {
      return min(minDepth(root.left), minDepth(root.right)) + 1;
    }
  }
}