class Solution {
    public int maxCount(int m, int n, int[][] ops) {
    	for (int i = 0; i < ops.length; i++) {
	    	m = Math.min(ops[i][0], m);
    		n = Math.min(ops[i][1], n);
    	}
    	return (m) * (n);
    }
}