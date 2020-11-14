class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
    	boolean[] state = new boolean[arr.length];
    	for (int i = 0; i < arr.length; i++) {
    		int cnt = 0;
    		int start = arr[i];
    		boolean flag = true;
    		while((++cnt) < k) {
    			if ((i + cnt * m ) < arr.length && start == arr[i + cnt * m]) continue;
    			else {
                    flag = false;
                    break;
                }
    		}
    		if (flag) state[i] = true;
    	}
    	int len = 0;
		int max = 0;    	
    	for (int j = 0; j < state.length; j++) {
            // System.out.println(state[j]);
    		if (state[j]) len++;
    		else {
    			max = Math.max(max, len);
    			len = 0;
    		}
    	}
        //  System.out.println(len);
    	if (max >= m) return true;
    	return false;
    }
}