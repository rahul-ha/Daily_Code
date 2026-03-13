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
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums,0,nums.length-1);
    }
    public TreeNode help(int nums[],int st,int en){
        if(st>en) return null;
        int mid = (st+en)/2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = help(nums,st,mid-1);
        n.right = help(nums,mid+1,en);
        return n;
    }
}