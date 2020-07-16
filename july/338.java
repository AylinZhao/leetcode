class Solution {
    public int[] countBits(int num) {
    	int[] f = new int[num + 1];
        if (num == 0) return f;
    	f[0] = 0;
    	f[1] = 1;
    	int cnt = 2;
    	while (cnt <= num) {
    		int p = cnt;
    		while (p >= cnt && p <= Math.min(num, cnt * 2)) {
	    		f[p] = f[p - cnt] + 1;
                p++;
	    	}
	    	cnt = cnt * 2;
    	}
	    return f;	
    }
}