class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int max = nums1.length - 1;
        int m1 = m - 1;
        int m2 = n - 1;
        while(max >= 0 && m1 >= 0 && m2 >= 0) {
        	if(nums1[m1] >= nums2[m2]) {
        		nums1[max] = nums1[m1];
        		m1--;
        	} else if(nums1[m1] < nums2[m2]) {
        		nums1[max] = nums2[m2];
        		m2--;
        	}
        	max--;
        }
        if(m1 < 0) {
        	while(m2 >= 0) {
        		nums1[max] = nums2[m2];
        		m2--;
        		max--;
        	}
        } 
    }
}