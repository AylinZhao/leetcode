class Solution {
    public boolean isPowerOfFour(int num) {
    	while (num > 1) {
            if (num % 4 == 0) num = num >> 2;
            else return false;
    	}
    	if (num == 1) return true;
        return false;
    }
}