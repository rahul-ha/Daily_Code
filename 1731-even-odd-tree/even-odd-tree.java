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
    public boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
       
        while(!q.isEmpty()){
            int size = q.size();
             int a = Integer.MAX_VALUE;
            int b = Integer.MIN_VALUE;
            for(int i =0;i<size;i++){
                if(level%2==0){
                    TreeNode n = q.poll();
                    if(n.val<=b || n.val%2==0) return false;
                    else{
                        b = n.val;
                        if(n.left!=null) q.add(n.left);
                        if(n.right!=null) q.add(n.right);
                    }}
                    else{
                        TreeNode n = q.poll();
                        if(n.val>=a || n.val%2!=0) return false;
                        else{
                            a = n.val;
                            if(n.left!=null) q.add(n.left);
                        if(n.right!=null) q.add(n.right);

                        }
                    }
            }
            level++;
        }
        return true;
    }
}