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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int a = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i =0;i<a;i++){
                TreeNode b = q.poll();
              if(b!=null)  al.add(b.val);
                if(b.left!=null) q.add(b.left);
                if(b.right!=null)  q.add(b.right);
            }
           ans.add(new ArrayList<>(al));
        }
        return ans;
    }
}