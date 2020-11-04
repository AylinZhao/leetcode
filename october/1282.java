class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
    	List<Integer> list = new ArrayList<Pair<Integer, Integer>>();
    	for (int i = 0; i < groupSizes.length; i++) {
 			Pair<Integer, Integer> pair = new Pair<>(groupSizes[i], i);
    		list.add(pair);
    	}
		Collections.sort(list, new Comparator<Pair<Integer, Integer>>() {
            public int compare(Pair o1, Pair o2) {
                int one = o1.getLeft();
                int two = o2.getLeft();
                if (one == two) {
                    return 0;
                }else {
                    // 从小到大
                    return one > two ? 1 : -1 ;
                    // 如果需要从大到小，可以将return的值反过来即可
                }
            }
            
        });
        System.out.println("排序后：");
        System.out.println(list);
        return 
    }
}