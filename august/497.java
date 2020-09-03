class Solution {
    int[][] rects;
    ArrayList<Integer> area = new ArrayList<>();
    int sum;
    public Solution(int[][] rects) {
    	this.sum = 0;
    	this.rects = rects;
    	for (int i = 0; i < rects.length; i++) {
    		int onearea = (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1);    		
            area.add(onearea);
    		sum += onearea;
    	}
    }	
   	
    public int whicharea(ArrayList<Integer> area, int num) {
    	int st = 1;
    	for (int i = 0; i < area.size(); i++) {
    		if (num >= st && num < area.get(i) + st) return i;
    		else if (num >= area.get(i) + st) {
    			st = area.get(i) + st;
    		}
    	}
    	return area.size() - 1;
    }

    
    public int[] pick() {
    	int randnumber = generate(sum, 1);
    	int p = whicharea(area, randnumber);
    	int[] rect = rects[p];
		int[] ret = new int[2];
		ret[0] = generate(rect[2], rect[0]);   		 
		ret[1] = generate(rect[3], rect[1]);
		return ret;
    }
    public int generate(int max, int min) {
		return min + (int)(Math.random() * (max - min + 1));
    }
}
