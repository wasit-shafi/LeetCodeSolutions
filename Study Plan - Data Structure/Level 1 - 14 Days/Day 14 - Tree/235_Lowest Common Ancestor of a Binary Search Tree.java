/**
 * @author WasitShafi
 * @since 09-DEC-2022
 */
// Question: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/?envType=study-plan&id=data-structure-i
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode currentNode = root;
    Set<Integer> distinctElements = new HashSet<Integer>();
    Stack<TreeNode> commonElements = new Stack<TreeNode>();

    // traverse element in path from root to p (inclusive of p node)
    while (currentNode.val != p.val) {
      distinctElements.add(currentNode.val);
      currentNode = currentNode.val > p.val ? currentNode.left : currentNode.right;
    }
    distinctElements.add(currentNode.val);

    // traverse element in path from root to q
    currentNode = root;
    while (currentNode.val != q.val) {
      if (distinctElements.contains(currentNode.val)) {
        commonElements.push(currentNode);
      }
      currentNode = currentNode.val > q.val ? currentNode.left : currentNode.right;
    }
    if (distinctElements.contains(currentNode.val)) {
      commonElements.push(currentNode);
    }

    return commonElements.peek();
  }
}