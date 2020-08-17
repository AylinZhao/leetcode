/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	String res = "";
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	if (root == null) return res;
    	queue.offer(root.val);
    	while (queue.size() > 0) {
    		int elem = queue.poll();
    		if (elem.left != null) queue.offer(elem.left);
    		if (elem.right != null) queue.offer(elem.right);
    	}
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
    }
}
5,4,6,
i,(2i+1),(2i+2),
0,1,2,3,4,5,6
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));