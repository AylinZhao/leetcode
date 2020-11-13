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
	public int res = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        dfs(root.left, 0);
        dfs(root.right, 1);
        return res;
    }
    public void dfs(TreeNode x, int flag) {
    	if (x == null) return;
    	if (x.left == null && x.right == null && flag == 0) {
    		res += x.val;
    		return;
    	};
    	dfs(x.left, 0);
    	dfs(x.right, 1);
    	return;
    }
}