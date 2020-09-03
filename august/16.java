class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	int ldiff = Integer.MAX_VALUE;
    	int rdiff = Integer.MAX_VALUE;
    	for (int i = 0; i < nums.length; i++) {
        	int sum = 0;
    		int start = i + 1;
    		int end = nums.length - 1;
    		while (start < end) {
    			sum = nums[i] + nums[start] + nums[end];
    			if (sum > target) {
    				ldiff = Math.min(ldiff, sum - target);
    				end--;
    			} else if (sum < target) {
    				rdiff = Math.min(rdiff, target - sum);
    				start++;
    			} else if (sum == target) {
                    return sum;
    			}
     		}
    	}
    	if (ldiff < rdiff) return target + ldiff;
    	return target - rdiff;
    }
}