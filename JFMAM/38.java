class Solution {
    public String countAndSay(int n) {
    	String next = "1";
    	if (n == 1) return next;
    	int cnt = 1;
    	while ((++cnt) <= n) {
            // String t = next;
    		next = findNext(next);
    	}
    	return next;
    }
    public String findNext(String s) {
    	String res = "";
    	for (int i = 0; i < s.length();) {
            char symbol = s.charAt(i);
    		int j = i;
    		while ((++j) < s.length()) {
    			if (s.charAt(j) == symbol) continue;
    			else break;
    		}
    		int num = j - i;
    		res += String.valueOf(num);
    		res += String.valueOf(symbol);
            i = j;                
    	}
    	return res;
    }
}
