import java.lang.Object;
class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
    	int[] mm = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    	int area = 0;
    	int sum = 0;
    	HashMap<Pair<Integer, Integer>, Integer> map = new HashMap<>();
    	for (int i = 0; i < rectangles.length; i++) {
    		int x1 = rectangles[i][0];
    		int y1 = rectangles[i][1];
    		int x2 = rectangles[i][2];
    		int y2 = rectangles[i][3];
    		Pair<Integer, Integer> pair1 = new Pair<>(x1, y1);
    		Pair<Integer, Integer> pair2 = new Pair<>(x1, y2);
    		Pair<Integer, Integer> pair3 = new Pair<>(x2, y1);
    		Pair<Integer, Integer> pair4 = new Pair<>(x2, y2);
    		if (map.containsKey(pair1)) {
    			map.put(pair1, map.get(pair1) + 1);
    		} else {
    			map.put(pair1, 1);
    		}
    		if (map.containsKey(pair2)) {
    			map.put(pair2, map.get(pair2) + 1);	
    		} else {
    			map.put(pair2, 1);
    		}
    		if (map.containsKey(pair3)) {
    			map.put(pair3, map.get(pair3) + 1);	
    		} else {
    			map.put(pair3, 1);
    		}
    		if (map.containsKey(pair4)) {
    			map.put(pair4, map.get(pair4) + 1);
    		} else {
    			map.put(pair4, 1);
    		}
    		if (x1 <= mm[0]) {
				mm[0] = x1;
			}
			if (y1 <= mm[1]) {
				mm[1] = y1;
			}
			if (x2 >= mm[2]) {
				mm[2] = x2;
			}
			if (y2 >= mm[3]) {
				mm[3] = y2;
			}
		}
    	area = (mm[2] - mm[0]) * (mm[3] - mm[1]);
    	for (int i = 0; i < rectangles.length; i++) {
			int matrixone = (rectangles[i][2] - rectangles[i][0]) * (rectangles[i][3] - rectangles[i][1]);
			sum += matrixone;
    	}
        // System.out.println("sum :" + sum + "area :" + area);

    	Pair<Integer, Integer> e1 = new Pair<>(mm[0], mm[1]);
		Pair<Integer, Integer> e2 = new Pair<>(mm[0], mm[3]);
		Pair<Integer, Integer> e3 = new Pair<>(mm[2], mm[3]);
		Pair<Integer, Integer> e4 = new Pair<>(mm[2], mm[1]);
		if (!map.containsKey(e1) || !map.containsKey(e2) || !map.containsKey(e3) || !map.containsKey(e4)) {
            // System.out.println("here :" + sum);
            return false;
        }
		if (map.get(e1) != 1 || map.get(e2) != 1 || map.get(e3) != 1 || map.get(e4) != 1) {
            // System.out.println("here :" + sum);
            return false;
        } 
		map.put(e1, 2);
		map.put(e2, 2);
		map.put(e3, 2);
		map.put(e4, 2);
    	Iterator iter = map.keySet().iterator();
    	while (iter.hasNext()) {
    	    Object key = iter.next();
            Integer val = map.get(key);
			if (val.intValue() % 2 != 0) {
                //  System.out.println("val :" + val + "key : " + key);
                return false;
            }
		}
    	if (sum != area) return false;
    	return true;
    }
}

