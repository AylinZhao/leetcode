/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int prenode = Integer.MAX_VALUE;
    public int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }
    public void dfs(TreeNode root) {
    	if (root == null) return;
    	dfs(root.right);
    	min = Math.min(min, prenode - root.val);
    	prenode = root.val;
        // System.out.println(prenode);
    	dfs(root.left);
    	return;
    }
}