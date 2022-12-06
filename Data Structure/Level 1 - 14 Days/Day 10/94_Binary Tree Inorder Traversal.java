/**
 * @author WasitShafi
 * @since 05-DEC-2022
 */
// Question: https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=study-plan&id=data-structure-i

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
  public void traversal(TreeNode node, List<Integer> inorderTraversalList) {
    if (node == null) {
      return;
    }
    traversal(node.left, inorderTraversalList);
    inorderTraversalList.add(node.val);
    traversal(node.right, inorderTraversalList);
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> inorderTraversalList = new ArrayList<Integer>();

    traversal(root, inorderTraversalList);
    return inorderTraversalList;
  }
}