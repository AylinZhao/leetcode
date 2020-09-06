class Solution {
    public int countBinarySubstrings(String s) {
    	if (s.equals("") || s.length() == 0 || s.length() == 1) return 0;
    	int res = 0;
    	int stone = 0;
    	int stzero = 0;
    	if (s.charAt(0) == '0') stzero++;
    	else stone++;
    	int i = 1;
    	while (i < s.length()) {
    		while (stone != 0 && i < s.length()) {
    			char c = s.charAt(i);
    			if (c == '1') {
    				if (stzero == 0) stone++;
    				else {
    					stone = 0;
    					break;	
    				}
	    		} else {
    				stone--;
    				stzero++;
    				res++;
    			}
    			i++;
    		}
    		while (stzero != 0 && i < s.length()) {
    			char c = s.charAt(i);
    			if (c == '0') {
    				if (stone == 0) stzero++;
    				else {
    					stzero = 0;
    					break;
    				}
	    		} else {
    				stzero--;
    				stone++;
    				res++;
    			}
    			i++;
    		}
    	}
    	
    	return res;	
    }
}