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
 *  @since 07-OCT-2020
 */

class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    if (root == null) {
      return ans;
    }
    
    TreeNode node;
    Queue<TreeNode> parents = new LinkedList<>();
    
    parents.add(root);
    while (!parents.isEmpty()) {
      Queue<TreeNode> childs = new LinkedList<>();
      ArrayList<Integer> levelNodes = new ArrayList<>();
    
      while (!parents.isEmpty()) {
        node = parents.remove();
        levelNodes.add(node.val);
        if (node.left != null) {
          childs.add(node.left);
        }
        if (node.right != null) {
          childs.add(node.right);
        }
      }
      parents = childs;
      ans.add(levelNodes);
    }
    return ans;
  }
}