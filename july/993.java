class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	Queue<TreeNode> p = new LinkedList<TreeNode>();
    	q.offer(root);
    	while (p.size() > 0 || q.size() > 0) {
    		boolean flagx = false;
    		boolean flagy = false;
	    	while (q.size() > 0) {
	    		TreeNode head = q.poll();
	    		if (head.val == x) flagx = true;
	    		else if (head.val == y) flagy = true; 
	    		TreeNode l = head.left;
	    		TreeNode r = head.right;
		    	if (l != null && r != null) {
		    		p.offer(l);
		    		p.offer(r); // l, r 属于同一高度的节点
    				if (Math.max(l.val, r.val) == Math.max(x, y) && Math.min(l.val, r.val) == Math.min(x, y)) {
    					return false;
    				} // 同祖先的两个节点
				}
				else if (l != null) p.offer(l);
				else if (r != null) p.offer(r);
	    	}
	    	if (flagy && flagx) return true;//表示在这一层找到了堂兄堂弟；
	    	flagx = false;
	    	flagy = false;
	    	while (p.size() > 0) {
	    		TreeNode head = p.poll();
	    		if (head.val == x) flagx = true;
	    		else if (head.val == y) flagy = true; 
	    		TreeNode l = head.left;
	    		TreeNode r = head.right;
		    	if (l != null && r != null) {
		    		q.offer(l);
		    		q.offer(r); // l, r 属于同一高度的节点
    				if (Math.max(l.val, r.val) == Math.max(x, y) && Math.min(l.val, r.val) == Math.min(x, y)) {
    					return false;
    				} // 同祖先的两个节点
				}
				else if (l != null) q.offer(l);
				else if (r != null) q.offer(r);
	    	}
	    	if (flagy && flagx) return true;//表示在这一层找到了堂兄堂弟；
		}
		return false;
    }
}