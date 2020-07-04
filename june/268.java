class Solution {
    public int missingNumber(int[] nums) {
    	int sum = 0;
    	int total = 0;
    	for(int i = 0; i < nums.length; i++) {
    		sum += nums[i];
    		total += i; 
    	}
    	return total + nums.length - sum;
    }
}