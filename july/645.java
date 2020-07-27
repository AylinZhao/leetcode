class Solution {
    public int[] findErrorNums(int[] nums) {
    	int exp = 0;
    	int actual = 0;
    	int rep = 0;
    	int index = 0;
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		exp += (i + 1);
    		actual += nums[i];
    		if (!map.containsKey(nums[i])) {
    			map.put(nums[i], 1);
    		} else {
    			index = i;
    		}
    	}
    	int[] res = new int[2];
    	res[0] = nums[index];
    	res[1] = exp - (actual - nums[index]);
    	return res;
    }
}