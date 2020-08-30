class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    	HashMap<String,Integer> map = new HashMap<>();
    	for (int i = 0; i < list1.length; i++) {
    		map.put(list1[i], i);
    	}
    	int index = Integer.MAX_VALUE;
    	for (int i = 0; i < list2.length; i++) {
    		if (map.containsKey(list2[i])) {
    			index = Math.min(index, i + map.get(list2[i]));
    		}
    	}
    	int cnt = 0;
    	for (int i = 0; i < list2.length; i++) {
    		if (map.containsKey(list2[i])) {
    			if ((i + map.get(list2[i])) == index) {
    				cnt++;	
    			}
    		}
    	}
    	String[] res = new String[cnt];	
    	int p = 0;
    	for (int i = 0; i < list2.length; i++) {
    		if (map.containsKey(list2[i])) {
	    		if ((i + map.get(list2[i])) == index) {
    				res[p] = list2[i];
    				p++;	
    			}
    		}
    	}
    	return res;

    }
}