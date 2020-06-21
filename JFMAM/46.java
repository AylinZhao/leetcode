class Solution {
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null && nums.length == 0) return res;
    	int[] state = new int[nums.length];
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	trial(state, nums, l, res);
        return res;
    }
    public void trial(int[] state, int[] nums, ArrayList<Integer> l, List<List<Integer>> res) {
    	//System.out.println(l.size());
        if (l.size() == nums.length) {
           //System.out.println("__" + l.get(0)+"__"+l.get(1)+"__"+l.get(2));
            ArrayList<Integer> ll = new ArrayList<Integer>(l); 
    		res.add(ll);
    		return;
    	}
    	for (int i = 0; i < nums.length; i++) {
    		if (state[i] == 1) continue;
    		state[i] = 1;
    		//ArrayList<Integer> lt = new ArrayList<Integer>(l);
    		l.add(nums[i]);
    		trial(state, nums, l, res);
    		state[i] = 0;
    		l.remove(l.size() - 1);
    	}
    	return;

    }
}