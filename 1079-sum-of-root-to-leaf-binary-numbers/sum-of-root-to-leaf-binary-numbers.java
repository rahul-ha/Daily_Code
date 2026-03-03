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
        List<String> list = new ArrayList<>();
        dfs(root, "", list);

        int sum = 0;
        for (String s : list) {
            sum += Integer.parseInt(s, 2);
        }
        return sum;
    }

    private void dfs(TreeNode node, String path, List<String> list) {
        if (node == null) return;

        // If leaf
        if (node.left == null && node.right == null) {
            list.add(path + node.val);  // directly append here
            return;
        }

        // Directly append inside recursive call
        dfs(node.left, path + node.val, list);
        dfs(node.right, path + node.val, list);
    }
}