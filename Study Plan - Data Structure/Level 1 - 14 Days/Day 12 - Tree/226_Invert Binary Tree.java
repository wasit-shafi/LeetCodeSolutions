/**
 * @author WasitShafi
 * @since 08-DEC-2022
 */
// Question:https://leetcode.com/problems/invert-binary-tree/?envType=study-plan&id=data-structure-i

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
  // Tip: keep recursive leap of faith in mind while dealing with recursion
  public void getInvertedTree(TreeNode node) {
    // base case
    if (node != null) {
      // do swapping
      TreeNode temp = node.left;
      node.left = node.right;
      node.right = temp;
      // do same for the sub trees
      if (node.left != null) {
        getInvertedTree(node.left);
      }
      if (node.right != null) {
        getInvertedTree(node.right);
      }
    }
  }

  public TreeNode invertTree(TreeNode root) {
    getInvertedTree(root);
    return root;
  }
}