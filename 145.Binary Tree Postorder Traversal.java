/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

class Solution {
  static ArrayList<Integer> arr = new ArrayList<>();
  public void traverse(TreeNode root) {
    if (root != null) {
      traverse(root.left);
      traverse(root.right);
      arr.add(root.val);
    }
  }
  
  public List<Integer> postorderTraversal(TreeNode root) {
    arr.clear();
    traverse(root);
    return arr;
  }
}