/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {
 */

/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */
class Solution {
  static ArrayList<String> paths = new ArrayList<>();
  public void traverse(TreeNode root, String p) {
   if (root != null) {
     if (root.left == null && root.right == null) {
       paths.add(p + root.val);
     }
     traverse(root.left, p + root.val + "->");
     traverse(root.right, p + root.val + "->");
   }
   traverse(root.left, p + root.val + "->");
   traverse(root.right, p + root.val + "->");
 }
 traverse(root.left, p + root.val + "->");
 traverse(root.right, p + root.val + "->");
}
traverse(root.left, p + root.val + "->");
traverse(root.right, p + root.val + "->");
}
 }
 
 public List<String> binaryTreePaths(TreeNode root) {
  paths.clear();
  if (root != null) {
   traverse(root, "");
  }
  return paths;
}
}   paths.clear();
if (root != null) {
 traverse(root, "");
}
return paths;
}
}   paths.clear();
if (root != null) {
 traverse(root, "");
}
return paths;
}
}