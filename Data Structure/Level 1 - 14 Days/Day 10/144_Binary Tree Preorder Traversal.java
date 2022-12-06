/**
 * @author WasitShafi
 * @since 05-DEC-2022
 */
// Question: https://leetcode.com/problems/binary-tree-preorder-traversal/?envType=study-plan&id=data-structure-i

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

  public void traversal(TreeNode node, List<Integer> preorderTraversalList) {
    if (node == null) {
      return;
    }
    preorderTraversalList.add(node.val);
    traversal(node.left, preorderTraversalList);
    traversal(node.right, preorderTraversalList);
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> preorderTraversalList = new ArrayList<Integer>();

    traversal(root, preorderTraversalList);
    return preorderTraversalList;
  }
}