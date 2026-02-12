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
        if(root==null) return true;
        ArrayList<Integer> al = new ArrayList<>();
        check(root,al);
        int a = al.get(0);
        for(int i =1;i<al.size();i++){
            if(a>=al.get(i)) return false;
            else{
                a = al.get(i);
            }
        }
        return true;
    }
public void check(TreeNode root, ArrayList<Integer>al){
    if(root ==null) return ;
     check(root.left,al);
     al.add(root.val);
    check(root.right,al);

}
}