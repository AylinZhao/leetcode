class Solution {
    public int findTargetSumWays(int[] nums, int S) {
    	return (search(0, S, nums) % (Integer.MAX_VALUE));
    }
    public int search(int p, int target, int[] nums) {
    	if (p == (nums.length - 1)) {
    		if (target == 0 && nums[p] == 0) return 2;
    		if (target == nums[p] || (target + nums[p]) == 0) {
    			return 1;	
    		} else {
    			return 0;
    		}
    	} 
    	return (search(p + 1, target + nums[p], nums) + search(p + 1, target - nums[p], nums)) % (Integer.MAX_VALUE);
    }
}
// [1,0]