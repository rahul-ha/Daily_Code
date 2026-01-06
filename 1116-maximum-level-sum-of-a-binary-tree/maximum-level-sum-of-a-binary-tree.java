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
    public int maxLevelSum(TreeNode root) {
        if(root== null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int l = 0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        while(!q.isEmpty()){
            l++;
            int sum = 0;
            int n = q.size();
            for(int i = 0;i<n;i++){
                TreeNode a = q.poll();
                sum = sum+ a.val;
                if(a.left!=null) q.add(a.left);
                if(a.right != null) q.add(a.right);
            }
            if(sum>max){
                max = sum;
                ans = l;
            }

        }
        return ans;
    }
}