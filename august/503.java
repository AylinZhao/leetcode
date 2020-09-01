class Solution {
    public int[] nextGreaterElements(int[] nums) {
    	int len = nums.length;
    	if (nums == null || len == 0) return nums;
    	if (len == 1) {
    		nums[0] = -1;
    		return nums;
    	} 
    	int[] bigger = new int[len];
    	bigger[0] = -1;
    	for (int i = 1; i < len; i++) {
    		if (nums[i] > nums[i - 1]) {
    			int jump = i - 1;
    			while (jump >= 0) {
    				if (bigger[jump] == 0) {
    					if (nums[jump] < nums[i]) bigger[jump] = i - jump;
    					else if (nums[jump] >= nums[i]) bigger[i] = jump - i; 
    					break;
    				} else if (bigger[jump] < 0) {
    					if (nums[jump] < nums[i]) {
    						int diff = bigger[jump];
    						bigger[jump] = i - jump;
    						jump = jump + diff;
    						continue;	
    					} else if (nums[jump] >= nums[i]) {
    						bigger[i] = jump - i;
    						break;
    					}
    				}
    			}
    		} else if (nums[i] <= nums[i - 1]) {
    			bigger[i] = -1;
    		}
    	}
    	for (int i = 0 ;i < len - 1; i++) {
    		if (nums[i] > nums[len - 1]) bigger[len - 1] = i - len + 1;
    	}
    	int[] res = new int[len];
    	for (int i = 1; i < len; i++) {
    		if (bigger[i] == 0) res[i] = -1;
            else res[i] = nums[bigger[i] + i];
    	}
    	return res;
    }
}