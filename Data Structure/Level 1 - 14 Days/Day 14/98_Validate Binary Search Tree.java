/**
 * @author WasitShafi
 * @since 10-DEC-2022
 */
// Question: https://leetcode.com/problems/validate-binary-search-tree/description/?envType=study-plan&id=data-structure-i
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
  static long previousValue = (long) (Math.pow(2, 31) + 1) * -1;

  // using in-order traversal approach
  public static boolean checkValidBST(TreeNode node) {
    if (node == null) {
      return true;
    }
    boolean isValid = checkValidBST(node.left);

    if (node.val <= previousValue) {
      return false;
    }
    previousValue = node.val;
    return isValid && checkValidBST(node.right);
  }

  public boolean isValidBST(TreeNode root) {
    // resetting previous value for all the test cases leetcode runs, as static will
    // is available at class level and will not be re-initialized all the time
    // before running main
    previousValue = (long) (Math.pow(2, 31) + 1) * -1;
    return checkValidBST(root);
  }
}
