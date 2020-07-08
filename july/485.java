class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int cnt = 0;
    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 1) {
    			cnt += 1;
    		} else if (nums[i] == 0) {
    			max = Math.max(cnt, max);
    			cnt = 0;
    		}
    	}
        max = Math.max(cnt, max);
    	return max;
    }
}