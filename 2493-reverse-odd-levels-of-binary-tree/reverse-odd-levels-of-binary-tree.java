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
    public TreeNode reverseOddLevels(TreeNode root) {
        mirror(root.left,root.right,1);
        return root;
    }
    public void mirror(TreeNode p,TreeNode q,int level){
        if(p==null || q==null) return;
        if(level%2!=0){
            int n = q.val;
            q.val = p.val;
            p.val   = n;
        }
        mirror(p.left,q.right,level+1);
        mirror(p.right,q.left,level+1);
    }
}