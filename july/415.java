class Solution {
    public String addStrings(String num1, String num2) {
    	int p = num1.length() - 1;
    	int q = num2.length() - 1;
    	int left = 0;
    	String res = "";
    	while (p >= 0 && q >= 0) {
    		int pe = Character.getNumericValue(num1.charAt(p));
    		int qe = Character.getNumericValue(num2.charAt(q));
    		p--;
            q--;
            int sum = pe + qe + left;
    		left = sum / 10;
    		res = String.valueOf((sum % 10)) + res;
    	}
    	if (q >= 0) {
    		while (q >= 0) {
    			int qe = Character.getNumericValue(num2.charAt(q));
    			q--;
                int sum = qe + left;
    			left = sum / 10;
        		res = String.valueOf((sum % 10)) + res;
    		}
    	}
    	if (p >= 0) {
    		while (p >= 0) {
    			int pe = Character.getNumericValue(num1.charAt(p));
    			p--;
                int sum = pe + left;
    			left = sum / 10;
        		res = String.valueOf((sum % 10)) + res;
    		}
    	}
        if (left != 0) res = left + res;
    	return res;
    }
}