class Solution {
    public HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); 
    public Solution(int[] nums) {
        map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
    		if (!map.containsKey(nums[i])) {
    			ArrayList<Integer> l = new ArrayList<>();
    			l.add(i);
    			map.put(nums[i], l);
    		} else {
    			ArrayList<Integer> l = map.get(nums[i]);
    			l.add(i);
    			map.put(nums[i], l);
    		}
    	}
    }
    
    public int pick(int target) {
    	ArrayList<Integer> l = map.get(target);
        // System.out.println(l.size());
        int p = (int)(Math.random() * (l.size()));
    	return l.get(p);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */