class Solution {
    public int findShortestSubArray(int[] nums) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	HashMap<Integer, Integer> maplen = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
    		if (map.containsKey(nums[i])) {
    			int occur = map.get(nums[i]);
    			maplen.put(nums[i], i - occur + 1);
    		} else {
    			map.put(nums[i], i);
    		}
    	}
    	for () {
    		
    	}


    }
}