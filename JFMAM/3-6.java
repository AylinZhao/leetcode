class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
    	if (B.length == 0 || A.length == 0) return;
    	while (m >= 0 && n >= 0) {
            if (m == 0 && n != 0) {
                A[n - 1] = B[n - 1];
                n--;
                continue;
            }
            if (n == 0) return;
    		if (A[m - 1] >= B[n - 1]) {
    			A[m + n - 1] = A[m - 1];
    			m--;
    		} else {
    			A[m + n - 1] = B[n - 1];
    			n--;
    		}
    	}ic
    }
}