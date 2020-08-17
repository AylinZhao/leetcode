class Solution {
    public int[] constructRectangle(int area) {
    	int[] res = new int[2];
    	res[0] = area;
    	res[1] = 1;
    	int mindiff = res[0] - res[1];
    	for (int i = 1; i <= Math.sqrt(area); i++) {
    		if (area % i == 0) {
                int diff = (area / i) - i;
                if (diff < mindiff) {
                    mindiff = diff;
                    res[0] = area / i;
                    res[1] = i;
                }    
            }
            
        }
    	return res;
    }
}