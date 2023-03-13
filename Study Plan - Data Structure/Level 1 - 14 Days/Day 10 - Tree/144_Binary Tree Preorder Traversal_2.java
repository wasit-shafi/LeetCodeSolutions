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
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> preorderTraversalList = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode topOfStack = null;

    // iterative approach using stack
    if (root == null) {
      return preorderTraversalList;
    }

    stack.push(root);
    while (stack.isEmpty() == false) {
      topOfStack = stack.pop();
      preorderTraversalList.add(topOfStack.val);
      if (topOfStack.right != null) {
        stack.push(topOfStack.right);
      }
      if (topOfStack.left != null) {

        stack.push(topOfStack.left);
      }
    }
    return preorderTraversalList;
  }
}