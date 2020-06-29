import java.util.*;
class Solution {
    public int nthUglyNumber(int n) {
    // 1,2,3,5
    	PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
 				return o1.compareTo(o2);
			}	
		});
    	int[] ugly = {2,3,5};
    	int preNum = 0;
    	int start = 1;
    	pq.add(start);
    	int cnt = 1;
    	while (cnt <= n) {
    		int elem = pq.remove();
    		if (elem != preNum) {
    			cnt++;
    			preNum = elem;
    			for (int i = 0; i < ugly.length; i++) {
                    // System.out.println("elem *  : " + elem * ugly[i]);
    				if (ugly[i] > Integer.MAX_VALUE / elem) continue;
                    pq.add(ugly[i] * elem);
    			}
    		}
    	}	
    	return preNum;
    }
}