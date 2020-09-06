class Solution {
    public int leastBricks(List<List<Integer>> wall) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int len = 0;
    	for (int i = 0; i < wall.size(); i++) {
    		List<Integer> l = wall.get(i);
    		int sum = 0;
    		for (int j = 0; j < l.size(); j++) {
    			int num = l.get(j);
    			sum += num;
    			if (map.containsKey(sum)) {
    				map.put(sum, map.get(sum) + 1);
    			} else {
    				map.put(sum, 1);
    			}
    		}
    		len = sum;
    	}
    	map.remove(len);
    	int total = wall.size();
    	int min = wall.size();
    	for (Integer value : map.values()) {
 			min = Math.min(min, (total - value.intValue()));
		}
		return min;
    }
}