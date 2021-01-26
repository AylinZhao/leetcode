
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    	ArrayList<Pair<Integer, Integer>> arr = new ArrayList<>();
    	for (int i = 0; i < R; i++) {
    		for (int j = 0; j < C; j++) {
    			Pair<Integer, Integer> p = new Pair<Integer, Integer>(i, j);
    			arr.add(p);
    		}
    	}
    	Collections.sort(arr, new Comparator<Pair<Integer, Integer>>(){
    		public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
    			return (Math.abs(o1.getKey() - r0) + Math.abs(o1.getValue() - c0) - (Math.abs(o2.getKey() - r0) + Math.abs(o2.getValue() - c0))); 
    		}
    	});
    	int[][] res = new int[R * C][2];
    	for (int i = 0; i < arr.size(); i++) {
    		res[i][0] = arr.get(i).getKey();
    		res[i][1] = arr.get(i).getValue();
    	}
    	return res;
    }
}