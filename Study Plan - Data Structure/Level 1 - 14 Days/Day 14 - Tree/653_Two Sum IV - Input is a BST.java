/**
 * @author WasitShafi
 * @since 09-DEC-2022
 */
// Question: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/?envType=study-plan&id=data-structure-i
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

  public static boolean checkSum(TreeNode node, int k, Set distinctElements) {
    if (node == null) {
      return false;
    }
    if (distinctElements.contains(k - node.val)) {
      return true;
    }
    distinctElements.add(node.val);
    return checkSum(node.left, k, distinctElements) || checkSum(node.right, k, distinctElements);
  }

  public boolean findTarget(TreeNode root, int k) {
    Set<Integer> distinctElements = new HashSet<Integer>();

    return checkSum(root, k, distinctElements);
  }
}