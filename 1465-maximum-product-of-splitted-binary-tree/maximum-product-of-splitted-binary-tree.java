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
    long total = 0;
    long ans = 0;
    public int maxProduct(TreeNode root) {
        if(root==null) return 0;
        tsum(root);
        cal(root);
        return (int)(ans%1000000007);
    }
    public long tsum(TreeNode root){
        if(root==null) return 0;
        long a = tsum(root.left);
        long b = tsum(root.right);
        total = root.val+ a+b;
        return total;
    }
    public long cal(TreeNode root){
        if(root==null) return 0;
        long a = cal(root.left);
        long b = cal(root.right);
        long sub = root.val + a+b;
        ans = Math.max(ans,sub*(total-sub));
        return sub;
    }
}