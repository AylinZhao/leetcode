class Solution {
    public int hIndex(int[] citations) {
    	if (citations == null || citations.length == 0) return 0;
    	int l = 0;
    	int h = citations.length - 1;
    	if (citations[h] < 1) return 0;
    	if (citations[l] >= (citations.length)) return citations.length;
    	while (l < h) {
    		int mid = (l + h) / 2;
    		if (citations[mid] < (citations.length - mid)) {
    			l = mid + 1;
    		} else if (citations[mid] >= (citations.length - mid)) {
    			h = mid;
    		}
    	}

    	return citations.length - l;
    }
}