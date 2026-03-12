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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        check(root);
        return m+1;
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int a = check(root.left);
        int b = check(root.right);
        m = Math.max(m,Math.max(a,b));
        return 1+Math.max(a,b);
    }
}