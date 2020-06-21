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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> q = new PriorityQueue<>();
        dfs(root1, q);
        dfs(root2, q);
        List<Integer> l = new ArrayList<>();
        while(!q.isEmpty()) {
        	l.add(q.poll());
        }
        return l;
    }
    public void dfs(TreeNode root, Queue<Integer> q) {
    	if (root == null) return;
    	q.add(root.val);
    	dfs(root.left, q);
    	dfs(root.right, q);
    	return;
    }
}