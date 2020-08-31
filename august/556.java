class Solution {
    public int nextGreaterElement(int n) {
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	while (n != 0) {
			int r =  n % 10;
			l.add(r);
            System.out.println("r : " + r);
			n = n / 10;
    	}


		int p = Integer.MAX_VALUE;
		int x = 0;
    	for (int i = 0; i < l.size(); i++) {
    		int num = l.get(i);
    		int j = i + 1;
    		while (j < l.size()) {
    			if (l.get(j) < num) {
    				if (j < p) {
    					p = j;
    					x = i;
	    				break;
    				} 
    			}
                j++;
    		}
    	}
    	if (p == Integer.MAX_VALUE) return -1;
    	int temp = l.get(x);
    	l.set(x, l.get(p));
    	l.set(p, temp);
        if (p > 1) {
            int[] arr = new int[p];
            int k = p - 1;
            while (k >= 0) {
                arr[k] = l.get(k);
                k--;
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                l.set(p - 1 - i, arr[i]);
            } 
        }
       
        int res = 0;
		for (int i = (l.size() - 1); i >= 0; i--) { 
			if (res > (Integer.MAX_VALUE / 10)) return -1;			
            res = res * 10 + l.get(i);
		}
		return res;
    }
}