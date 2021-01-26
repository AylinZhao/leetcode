class Solution {
    public int[][] findContinuousSequence(int target) {
    	if (target == 2) return new int[0][0]; 
    	//at least two elements
    	ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    	ArrayList<Integer> l = new ArrayList<>();
    	int p = 1;
    	int q = target;
    	int sum = 0;
    	for (int i = p; i < q; i++) {
    		l.add(i);
    		sum += i;
    	}
    	for (int i = p; i < q; i++) {
    		ArrayList<Integer> t = new ArrayList<>();
			t.addAll(l);
    		for (int j = q; j > p; j--) {
				if (sum == target) {
					arr.add(t);
				} else if (sum > target) {
					sum -= j;	
					t.remove(t.size() - 1);
				} else if (sum < target) {
					break;
				}
    		}
    	}
    	
    }
}