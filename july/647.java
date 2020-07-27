class Solution {
    public int countSubstrings(String s) {
    	int res = 0;
    	for (int i = 0; i < s.length(); i++) {
    		res +=find(i, s);
    	}
    	return res;
    }
    public int find(int center, String s) {
    	int count = 1;//self 
    	if (center == s.length() - 1) return count;
		if (s.charAt(center) == s.charAt(center + 1)) {
			count++;
			int p = center - 1;
			int q = center + 2;
			while (p >= 0 && q < s.length()) {
				if (s.charAt(p) == s.charAt(q)){
	                count++;
	        		p--;
	    	    	q++;
	            } else break;
			} //双中心位center center+1	
		} 
		int p = center - 1;
		int q = center + 1;
		while (p >= 0 && q < s.length()) {
		if (s.charAt(p) == s.charAt(q)){
            count++;
    		p--;
	    	q++;
        } else break;
        
		}
    	return count;
    }
}