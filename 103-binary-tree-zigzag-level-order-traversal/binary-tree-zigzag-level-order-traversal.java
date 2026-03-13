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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int count =0;
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode n  = q.poll();
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                al.add(n.val);
            }
            if(count%2!=0) Collections.reverse(al);
            ans.add(al);
            count++;
        }
        return ans;

    }
}