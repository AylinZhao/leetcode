class Solution {
    public int findLHS(int[] nums) {
    	if (nums == null || nums.length <= 1) return 0;
    	int max = 0;
        Arrays.sort(nums);
        int start = 0;
        int nextstart = 0;
        boolean f = false;
        for (int i = 1; i < nums.length; i++) {
        	if (nums[i] - nums[start] == 1 && !f) {
        		f = true;
        		nextstart = i;
        	} else if (nums[i] - nums[start] > 1 && f){
        		f = false;
        		max = Math.max(max, i - start);
        		start = nextstart;
        		nextstart = i;
                i = i - 1;    
        	} else if (nums[i] - nums[start] > 1 && !f) {
        		start = i;
        		nextstart = i;
        	}
        }
        if (f) {
        	max = Math.max(max, nums.length - start);
        }
        return max;
    }
}