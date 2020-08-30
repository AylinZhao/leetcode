class Solution {
    public boolean checkPerfectNumber(int num) {
    	int sum = 0;
        if (num == 0) return false;
    	int start = 1;
    	int end = num;
    	while (start < end) {
    		if ((start < end) && (num % start) == 0) {
    			end = num / start;
    			sum += start;
                sum += end;;
    		}
            start++;
    	}
        if (sum == num * 2) return true;
    	return false;
    }
}	