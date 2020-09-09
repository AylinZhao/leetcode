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
    public int max = Integer.MIN_VALUE;
    public int longestUnivaluePath(TreeNode root) {
    	if (root == null) return 0;
    	int ret = find(root, root.val + 1);
    	return max;
    }
    public int find(TreeNode root, int preval) {
    	if (root == null) return 0;
		int left = find(root.left, root.val);
		int right = find(root.right, root.val);
		int sum = left + right;
    	max = Math.max(max, sum);
    	int ret = 0;
     	if (root.val == preval) {
    		ret = Math.max(left, right) + 1;
    	}
    	return ret;
    }
}