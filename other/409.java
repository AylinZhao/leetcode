class Solution {
    public int longestPalindrome(String s) {
    	int[] nums = new int[100];
    	for (int i = 0; i < s.length(); i++) {
    		nums[s.charAt(i) - 'A'] += 1;
    	}
    	int res = 0;
    	for (int j = 0; j < nums.length; j++) {
    		res += nums[j] / 2;
    	}
    	if (res * 2 == s.length()) return res * 2;
    	return res * 2 + 1;
    }
}