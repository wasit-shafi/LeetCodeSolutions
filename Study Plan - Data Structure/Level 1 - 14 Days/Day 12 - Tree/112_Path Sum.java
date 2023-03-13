/**
 * @author WasitShafi
 * @since 08-DEC-2022
 */
// Question: https://leetcode.com/problems/path-sum/?envType=study-plan&id=data-structure-i

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
  public boolean checkPathSum(TreeNode node, int value) {
    if (node == null) {
      return false;
    }
    return (value - node.val == 0 && node.left == null && node.right == null)
        || checkPathSum(node.left, value - node.val)
        || checkPathSum(node.right, value - node.val);
  }

  public boolean hasPathSum(TreeNode root, int targetSum) {
    return checkPathSum(root, targetSum);
  }
}