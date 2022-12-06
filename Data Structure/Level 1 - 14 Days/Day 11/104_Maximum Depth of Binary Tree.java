/**
 * @author WasitShafi
 * @since 06-DEC-2022
 */
// Question: https://leetcode.com/problems/maximum-depth-of-binary-tree/?envType=study-plan&id=data-structure-i

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  public int getMaxDepth(TreeNode node, int currentLevel) {
    if (node == null) {
      return currentLevel - 1;
    }
    return Math.max(getMaxDepth(node.left, currentLevel + 1), getMaxDepth(node.right, currentLevel + 1));
  }

  public int maxDepth(TreeNode root) {
    return getMaxDepth(root, 1);
  }
}