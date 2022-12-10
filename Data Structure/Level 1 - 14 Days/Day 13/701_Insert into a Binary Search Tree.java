/**
 * @author WasitShafi
 * @since 09-DEC-2022
 */
// Question:https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
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
  public TreeNode insertIntoBST(TreeNode root, int val) {
    TreeNode currentNode = root;
    TreeNode previousNode = null;
    TreeNode newNode = new TreeNode(val, null, null);

    if (root == null) {
      root = newNode;
      return root;
    }

    while (currentNode != null) {
      previousNode = currentNode;
      if (currentNode.val > val) {
        currentNode = currentNode.left;
      } else {
        currentNode = currentNode.right;
      }
    }

    if (previousNode.val > val) {
      previousNode.left = newNode;
    } else {
      previousNode.right = newNode;
    }

    return root;
  }
}