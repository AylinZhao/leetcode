class Solution {
    public boolean isPathCrossing(String path) {
    	// S (0, -1) N (0, 1) W (-1, 0) E (1, 0)
    	HashSet<Pair<Integer, Integer>> set = new HashSet<>();
    	Pair<Integer, Integer> start = new Pair<>(0,0);
    	set.add(start);
    	int x = 0;
    	int y = 0;
    	for (int i = 0; i < path.length(); i++) {
    		if (path.charAt(i) == 'N') {
    			y += 1;
    		} else if (path.charAt(i) == 'S') {
    			y -= 1;
    		} else if (path.charAt(i) == 'W') {
    			x -= 1;
    		} else if (path.charAt(i) == 'E') {
    			x += 1;
    		}
    		Pair<Integer, Integer> cnt = new Pair<>(x, y);
    		if (set.contains(cnt)) return true;
    		else set.add(cnt);
    	}
    	return false;
    }
}

// "WSSESEEE"