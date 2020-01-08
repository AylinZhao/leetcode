class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	    List<List<Integer>> res = new ArrayList<>();	
        ArrayList<Integer> l = new ArrayList<>();
        int[] state = new int[graph.length];//记录每个点的使用情况
        search(res, graph, l, state, 0);
		return res;	        
    }
    public void search(List<List<Integer>> res, int[][] graph, ArrayList<Integer> l, int[] state, int p)    {
        //System.out.println(p);
    	if (state[p] == 1) return;
    	if (p == graph.length - 1) {
    		l.add(p);
    		res.add(l);
            return;
    	}
       // System.out.println(p);
    	state[p] = 1;
    	l.add(p); 
    	int[] next = graph[p];
    	for (int i = 0; i < next.length; i++) {
            ArrayList<Integer> ll = new ArrayList<>(l);//保存l的状态不被改变
    		search(res, graph, ll, state, next[i]);
    	}
    	state[p] = 0;
    	l.remove(l.size() - 1);
    	return;
    }
}