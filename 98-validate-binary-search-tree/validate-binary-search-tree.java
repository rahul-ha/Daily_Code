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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        check(root, al);
        for(int i =0;i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1)) return false;
        }
        return true;
    }
    public void check(TreeNode root , ArrayList<Integer> al){
        if(root ==null) return;
        check(root.left,al);
        al.add(root.val);
        check(root.right,al);

    }
}