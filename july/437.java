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
    public int res;
    public int pathSum(TreeNode root, int sum) {
    	if (root == null) return 0;
		res = 0;
        target = sum;
		dfs(root);
    	return res;
    }
    public void dfs(TreeNode root) {
    	if (root == null) return;
    	res += find(root, target);
        // System.out.println( "current node :" + root.val + "return : " + find(root, target));        

    	dfs(root.left);
    	dfs(root.right);
    	return;	
    }
    public int find(TreeNode root, int target) {
    	if (root == null) return 0;
        int cul = 0;
    	if (root.val == target) cul++;
    	int left = find(root.left, target - root.val);
		int right = find(root.right, target - root.val);
		return left + right + cul;
    }
}