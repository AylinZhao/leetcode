class Solution {
    public int removeDuplicates(int[] nums) {
    	if (nums.length == 1 || nums.length == 0) return nums.length;
    	int p = 0;
    	for (int q = 1; q < nums.length; q++) {
    		if (nums[q] != nums[p]) {
    			if((p + 1) < q) {
    				nums[p + 1] = nums[q];
    				p++;
    			} else {
    				p++;
    			} 
    		}
    	}
    	return p + 1;

    }
}