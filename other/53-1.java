class Solution {
	// 这是个训练二分查找的好题目，涉及了元素不存在的情况，元素存在情况
	// 针对元素不存在的情况
	// 当元素均大于target时，l:出现在最左侧； r: 出现在最右侧
	// 当元素均小于target时，l:出现在最右侧； r: 也出现在最右侧
	
    public int search(int[] nums, int target) {
        if (nums.length == 0) return 0;
    	int low = 0;
    	int high = nums.length - 1;
    	while(low < high) {
    		int mid = (low + high) / 2;
    		if (nums[mid] < target) {
    			low = mid + 1;
    		} else if (nums[mid] >= target) {
    			high = mid;
    		}
    	}
    	int l = 0;
    	if (nums[low] == target) l = low;
    	else return 0; 
    	
    	low = 0;
    	high = nums.length - 1;
    	while (low < high) {
    		int mid = (low + high) / 2;
    		if (nums[mid] <= target) {
    			low = mid + 1;
    		} else if (nums[mid] > target) {
    			high = mid;
    		}
        }
    	int r = 0;
    	if (nums[low] == target) r = low;
        else if (low >= 1 && nums[low] != target && nums[low - 1] == target) r = low - 1;
        else return 0;
    	return r - l + 1;
    }
}