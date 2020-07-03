class Solution {
    public int integerBreak(int n) {
    	if (n == 2) return 1;
    	int[] f = new int[n + 1];
    	f[1] = 1;
    	f[2] = 1;
    	int max = Integer.MIN_VALUE;
    	for (int i = 3; i <= n; i++) {
    		f[i] = findMax(i, f);
    	}
    	return f[n];
    }
    public int findMax(int m, int[] f) {
    	int max = 0;
    	for (int i = 1; i < m; i++) {
    		max = Math.max(max, Math.max(f[i], i) * Math.max(f[m - i], m - i));
    	    // if(m == 5) {
            //     System.out.println("f[i] * f[m - i] = " +f[i] + " " + f[m - i]+ " "+f[i] * f[m - i]);
            //     System.out.println(max);
            // }
        }
        return max;
    }
}