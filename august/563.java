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
    public int sum = 0;
    public int findTilt(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<>();
        search(root);
    	return sum;
    }
    public int search(TreeNode root) {
    	if (root == null) return 0;
    	int left = search(root.left);
    	int right = search(root.right);
    	sum += Math.abs(left - right);
    	return root.val + left + right;
    }
}