class Solution {
    public void rotate(int[] nums, int k) {
    	int real = k % nums.length;
    	int p = 0;
    	int curring = nums[p];
    	nums[p] = -1;
    	p = (p + real) % (nums.length); 
    	while (nums[p] != -1) {
    		tmp = nums[p];
    		nums[p] = curring;
    		curring = tmp;
	    	p = (p + real) % (nums.length); 
    	}
    	nums[p] = curring;
    }
}

// [-1,-100,3,99] 
// 2
// [3,-100,-1,99]
// [3,99,-1,-100]