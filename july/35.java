class Solution {
    public int searchInsert(int[] nums, int target) {
    	if (nums == null || nums.length == 0) return 0;
    	int low = 0;
    	int high = nums.length - 1;
    	while (low < high) {
    		int mid = (low + high) / 2;
    		if (nums[mid] > target) {
    			high = mid;
    		} else if (nums[mid] < target) {
    			low = mid + 1;
    		} else {
    			return mid;
    		}
    	}
    	if (nums[low] < target) return low + 1;
    	return low;
    }

}