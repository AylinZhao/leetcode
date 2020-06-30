class Solution {
    public void moveZeroes(int[] nums) {
    	int p = 0;
    	int q = 0;
    	while (true) {
    		while (p < nums.length && nums[p] != 0) {
    			p++;
    		};
    		q = p;
    		while (q < nums.length && nums[q] == 0) {
    			q++;
    		}
    		if (p >= q || q == nums.length) break;
    		swap(p, q, nums);
    	} 
    }
    public void swap(int p, int q, int[] nums) {
    	int t = nums[p];
    	nums[p] = nums[q];
    	nums[q] = t;
    }
}