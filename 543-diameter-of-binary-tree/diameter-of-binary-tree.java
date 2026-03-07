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
class Solution {
     int m = 0;
    public int diameterOfBinaryTree(TreeNode root) {
      
        dept(root);
        return m;
    }

public int dept(TreeNode root){
    if(root==null)
    return 0;
    
    int l = dept(root.left);
    int r = dept(root.right);
     m = Math.max(m,l+r);
    return 1+Math.max(l,r);
}
}