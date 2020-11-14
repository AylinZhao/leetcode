class Solution {
    public void sortColors(int[] nums) {
    	int ps = -1;
    	int p = 0;
    	int q = nums.length - 1;
    	boolean flag = false;
    	while (p < q) {
    		while (p <= q) {
    			if (nums[p] == 1 && flag == false) {
            		ps = p;
            		flag = true;
	            } else if(nums[p] == 0 && flag) {
	            	swap(nums, p, ps);
	            	ps++;
                } else if(nums[p] == 2) {
	            	break;

	            }
	            p++; 	
            }
    		while (p < q) {
    			if (nums[q] == 1) break;
    			if (nums[q] == 0 && ps != -1) {
    				swap(nums, q, ps);
    				ps++;
                    continue;
    			} else if(nums[q] == 0 && ps == -1) {
    				break;
    			}
    			q--;
    		}
    		if (p < q) {
    			swap(nums, q, p);
    		}
    	}
    }
    public void swap(int[] nums, int p, int q){
    	int t = nums[p];
		nums[p] = nums[q];
		nums[q] = t;
    }
}
 