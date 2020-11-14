class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < arr2.length; i++) {
    		map.put(arr2[i], i);
    	}
    	ArrayList<Pair<Integer, Integer>> arr = new ArrayList<>();
    	for (int j = 0; j < arr1.length; j++) {
    		int v = arr2.length + 1;
    		if (map.containsKey(arr1[j])) v = map.get(arr1[j]); 
    		Pair<Integer, Integer> p = new Pair<>(arr1[j], v);
    		arr.add(p);
    	}
    	Collections.sort(arr, new Comparator<Pair<Integer, Integer>>(){
    		public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if (o1.getValue().compareTo(o2.getValue())!= 0) {
                	return o1.getValue() - o2.getValue();
                } else {
                	return o1.getKey() - o2.getKey();
                }
            }
    	});
    	int[] res = new int[arr1.length];
    	for (int i = 0; i < arr.size(); i++) {
    		Pair<Integer, Integer> p = arr.get(i);
    		res[i] = p.getKey();
    	}
    	return res;
    }
}