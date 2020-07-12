class Solution {
    public int totalHammingDistance(int[] nums) {
    	int total = 0;
    	int k = 31;
    	while (k != 0) {
    		int cntofone = 0;
    		for (int i = 0; i < nums.length; i++) {
	    		if ((nums[i] & 1) == 1) cntofone++;
	    		nums[i] = nums[i] >> 1;
	    	}
	    	total += cntofone * (nums.length - cntofone);
    		k--;
    	}
    	return total;
    }
}