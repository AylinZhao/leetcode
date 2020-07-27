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
	public int target;
    public int pathSum(TreeNode root, int sum) {
    	target = sum;


    }
    public int dfs(TreeNode node, int res) {
    	if (node == null) return 0;
    	int left = dfs(node.left);
    	int right = dfs(node.right);
    	if (node.val + left == target) {
    		res++;
    	} else if ()
    }
}