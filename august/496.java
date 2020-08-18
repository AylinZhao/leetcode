class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	//-1
    	int[] res = new int[nums1.length];
    	if (nums1.length == 0) return res;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int j = 0; j < nums2.length; j++) {
    		map.put(nums2[j], j);
    	}
    	for (int i = 0; i < nums1.length; i++) {
    		int p = map.get(nums1[i]);
    		// System.out.println(" p: " + p + " nums1[i]: " + nums1[i] + " : " + " ");
    		res[i] = -1;
    		while (p < nums2.length) {
    			if (nums2[p] > nums1[i]) {
    				res[i] = nums2[p];
    				break;
    			}
    			p++;
    		}
    	}
    	return res;
    }
}