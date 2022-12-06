/**
 * @author WasitShafi
 * @since 06-DEC-2022
 */
// Question: https://leetcode.com/problems/binary-tree-level-order-traversal/?envType=study-plan&id=data-structure-i

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
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<LinkedList<TreeNode>> levelOrderElements = new ArrayList<LinkedList<TreeNode>>();
    TreeNode currentNode = null;
    int i = 0;

    levelOrderElements.add(new LinkedList<TreeNode>());
    levelOrderElements.add(new LinkedList<TreeNode>());
    if (root == null) {
      return result;
    }
    levelOrderElements.get(0).add(root);

    while (levelOrderElements.get(0).isEmpty() == false || levelOrderElements.get(1).isEmpty() == false) {
      List<Integer> temp = new ArrayList<Integer>();
      while (levelOrderElements.get(i % 2).isEmpty() == false) {
        currentNode = levelOrderElements.get(i % 2).peek();
        if (currentNode.left != null) {
          levelOrderElements.get((i + 1) % 2).add(currentNode.left);
        }
        if (currentNode.right != null) {
          levelOrderElements.get((i + 1) % 2).add(currentNode.right);
        }
        temp.add(currentNode.val);
        levelOrderElements.get(i % 2).poll(); // remove first element
      }
      result.add(temp);
      i++;
    }
    return result;
  }
}