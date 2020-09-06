class Solution {
    public int arrayNesting(int[] nums) {
		boolean[] state = new boolean[nums.length];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (state[nums[i]] == false) {
				int cur = nums[i];
				int cnt = 0;
				while (state[cur] == false) {
					state[cur] = true;
					cur = nums[cur];
					cnt++;
				}
				max = Math.max(cnt, max);
			}
		}    	
		return max;
    }
}