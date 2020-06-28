class Solution {
    public int hIndex(int[] citations) {
    	if (citations == null || citations.length == 0) return 0;
    	Arrays.sort(citations);
    	int len = citations.length - 1;
    	int low = 0;
    	int high = len;
    	if (citations[high] < 1) return 0;
    	if (citations[low] >= (len + 1)) return len + 1;
    	while (low < high) {
    		int mid = (low + high) / 2;
    		if (citations[mid] < (len - mid + 1)) {
    			low = mid + 1;
    		} else if (citations[mid] >= (len - mid + 1)) {
    			high = mid;
    		} 
    	return citations.length - low;
    }
}