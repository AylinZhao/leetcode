class Solution {
    public int numSquares(int n) {
    	int[] f = new int[n + 1];
    	for (int k = 1; k <= n; k++) {
    		int min = Integer.MAX_VALUE;	    	
	    	for (int i = 1; i * i <= k; i++) {
	    		min = Math.min(min, f[k - i * i] + 1);
	    	}
	    	f[k] = min;
		}
		return f[n];
    }
}