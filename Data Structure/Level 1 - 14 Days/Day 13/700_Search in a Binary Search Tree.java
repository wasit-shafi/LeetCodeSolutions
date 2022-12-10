/**
 * @author WasitShafi
 * @since 08-DEC-2022
 */
// Question: https://leetcode.com/problems/search-in-a-binary-search-tree/?envType=study-plan&id=data-structure-i

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
  public TreeNode searchNode(TreeNode node, int val) {
    if (node == null) {
      return null;
    }

    if (node.val == val) {
      return node;
    }
    TreeNode tempNode = null;

    if (node.left != null) {
      // search in left subtree
      tempNode = searchNode(node.left, val);
    }
    if (tempNode == null && node.right != null) { // not found in left sub-tree
      tempNode = searchNode(node.right, val);
    }

    return tempNode; // tempNode will be either null or the node with required value
  }

  public TreeNode searchBST(TreeNode root, int val) {
    return searchNode(root, val);
  }
}