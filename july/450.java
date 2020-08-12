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
	public TreeNode deleteNode(TreeNode root, int key) {
		TreeNode res = new TreeNode(Integer.MAX_VALUE);
		res.left = root;
		find(root, key, res);
		return res.left;
    }
    public void find(TreeNode root, int key, TreeNode prenode) {
    	if (root == null) return;
        // System.out.println(root.val);
    	if (root.val == key) {
    		TreeNode nroot = move(root);
    		if (prenode.val > key) {
    			prenode.left = nroot;
    		} else if (prenode.val < key) {
    			prenode.right = nroot;
    		}
    	} else if (root.val > key) {
	    	find(root.left, key, root);
    	} else if (root.val < key) {
    		find(root.right, key, root);
    	}
    	return;
    }
    public TreeNode move(TreeNode root) {
    	if (root.left == null && root.right == null) return null;
    	if (root.left == null) {
    		return root.right;
    	} 
   		if (root.right == null) {
    		return root.left;
    	}
    	TreeNode x = root.right;
        TreeNode r = root.right;
    	while (x.left != null) {
    		x = x.left;
    	}
    	x.left = root.left;
    	return r;
    }
}

