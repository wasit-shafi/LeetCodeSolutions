/**
 * @author WasitShafi
 * @since 05-DEC-2022
 */
// Question: https://leetcode.com/problems/binary-tree-postorder-traversal/?envType=study-plan&id=data-structure-i

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
  public void traversal(TreeNode node, List<Integer> postorderTraversalList) {
    if (node == null) {
      return;
    }
    traversal(node.left, postorderTraversalList);
    traversal(node.right, postorderTraversalList);
    postorderTraversalList.add(node.val);
  }

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> postorderTraversalList = new ArrayList<Integer>();

    traversal(root, postorderTraversalList);
    return postorderTraversalList;
  }
}