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
 *  @since 24-SEP-2020
 */

class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    
    int length = nums.length;
    if(length == 0) {
      return null;
    }
    
    TreeNode head = new TreeNode(nums[0]);
    TreeNode cur = null;
    TreeNode pre = null;
    
    for (int i = 1; i < length; i++) {
      cur = head;
      while (cur != null) {
        pre = cur;
        if (nums[i] > cur.val) {
          cur = cur.right;
        } else {
          cur = cur.left;
        }
      }
      
      if (nums[i] > pre.val) {
        pre.right = new TreeNode(nums[i]);
      } else {
        pre.left = new TreeNode(nums[i]);
      }
    }
    return head;
  }
}