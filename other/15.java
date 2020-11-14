class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	if (nums == null || nums.length < 3) return res;
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length; i++) {
    		if (i > 0 && nums[i] == nums[i - 1]) continue;
    		int p = i + 1;
    		int q = nums.length - 1;
    		int target = 0 - nums[i];
    		while(p < q) {
    			if ((nums[p] + nums[q])== target) {
                    // System.out.println("axis ： "+ i + "_" + p + "_"+ q);
                    if (nums[p] == nums[p - 1] && p != i + 1) {
                        p++;
                        continue; 
                    } 
                    if (q != nums.length - 1 && nums[q] == nums[q + 1]) {
                        q--;
                        continue;
                    } 
    				ArrayList<Integer> l = new ArrayList<Integer>();
    				l.add(nums[i]);
    				l.add(nums[p]);
    				l.add(nums[q]);
    				res.add(l);
    				p++;
    				q--;
    			} else if ((nums[p] + nums[q]) < target) {
    				p++;
    			} else if ((nums[p] + nums[q]) >  target) {
    				q--;
    			}
    		}
    	}
    	return res;
    }
}