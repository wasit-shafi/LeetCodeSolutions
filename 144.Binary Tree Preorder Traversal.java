<<<<<<< HEAD
=======

>>>>>>> 585199eb8f59730a4cc54cf3837e8dc155b0ee49
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
    if(root != null) {
      arr.add(root.val);
      traverse(root.left);
      traverse(root.right);
    }
  }
  
  public List<Integer> preorderTraversal(TreeNode root) {
    arr.clear();
    traverse(root);
    return arr;
  }
}