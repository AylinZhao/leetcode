class Solution {
    public int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0) return 0;
    	int n = A.length;
    	int max = Integer.MIN_VALUE;
    	// int[] f = new int[n];
    	for (int st = 0; st < n; st++) {
    		max = Math.max(count(A, st), max);
    	}
    	return max;
    }
    public int count(int[] A, int st) {
    	int len = A.length;
    	int res = 0;
    	int i = 0;
        // int start = st;
    	while (i < len) {
    		res += A[st % len] * i;
    		i++;
    		st++; 
    	}
    	return res;
    }
}