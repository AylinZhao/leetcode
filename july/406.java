class Solution {
    public int[][] reconstructQueue(int[][] people) {
    	// h, k
        if (people == null || people.length == 0) return people ;
    	ArrayList<Pair<Integer, Integer>> arr = new ArrayList<>();
    	for (int i = 0; i < people.length; i++) {
    		Pair<Integer, Integer> pair = new Pair<>(people[i][0], people[i][1]);
    		arr.add(pair);
    	}
    	Collections.sort(arr, new Comparator<Pair<Integer, Integer>>() {
			public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
				if (o1.getKey().compareTo(o2.getKey()) != 0) {
					return o2.getKey() - o1.getKey();
				} else {
					return o1.getValue() - o2.getValue();
				}
			}
		});
		ArrayList<Pair<Integer, Integer>> res = new ArrayList<>();
		// res.add(0, arr.get(0));
		for (int i = 0; i < arr.size(); i++) {	
			// Pair p = arr.get(i);
			// System.out.println("pair is :" + " " + p.getKey() + " " + p.getValue());
			res.add(arr.get(i).getValue(), arr.get(i));	
		}
		int[][] a = new int[people.length][people[0].length];
		for (int i = 0; i < res.size(); i++) {
			a[i][0] = res.get(i).getKey();
			a[i][1] = res.get(i).getValue();
		}
		return a;
    }
}

// Pair<Integer, String> pair = new Pair<>(1, "One");
// Integer key = pair.getKey();
// String value = pair.getValue();
//	add(int index, E element)
