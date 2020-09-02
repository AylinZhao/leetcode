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
    public int findBottomLeftValue(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	if (root != null) queue.offer(root);
    	while (queue.size() > 0) {
    		int len = queue.size();
    		for (int i = 0; i < len; i++) {
    			TreeNode node = queue.poll();
    			if (i == 0) res.add(node.val);
    			if (node.left != null) queue.offer(node.left);
    			if (node.right != null) queue.offer(node.right);
    		}
    	}
    	return res.get(res.size() - 1);
    }
}