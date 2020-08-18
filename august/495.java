class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    	int l = 0;
    	int r = 0;
    	int res = 0;
    	for (int i = 0; i < timeSeries.length; i++) {
    		if (r <= timeSeries[i]) {
    			res += r - l;
    		} else if (r > timeSeries[i] && timeSeries[i] > l) {
    			res += timeSeries[i] - l;
    		}
    		l = timeSeries[i];
			r = timeSeries[i] + duration;
    	}
    	res += (r - l);
    	return res;
    }
}