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
    public int sumRootToLeaf(TreeNode root) {
        return cal(root,0);
    }
    public int cal(TreeNode root, int cur){
        if(root==null) return 0;
        if(root.left==null && root.right==null) 
        return cur*2+ root.val;
        return cal(root.left,cur*2+root.val) + cal(root.right,cur*2+root.val);
    }
}