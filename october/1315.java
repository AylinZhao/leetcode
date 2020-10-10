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
    public int sumEvenGrandparent(TreeNode root) {
    	dfs(root);
    	return res;
    }
    public void dfs(TreeNode root) {
    	if (root == null) return;
    	if (root.val % 2 == 0) {
    		res += count(root.left);
    		res += count(root.right);
    	}
    	dfs(root.left);
    	dfs(root.right);
    	return;
    }
    public int count(TreeNode x) {
    	int cnt = 0;
    	if (x == null) return cnt;
    	if (x.left != null) cnt += x.left.val; 
    	if (x.right != null) cnt += x.right.val; 
    	return cnt;
    }
}