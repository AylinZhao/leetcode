class Solution {
    public int thirdMax(int[] nums) {
    	Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return o2.compareTo(o1);
            }
        };

        Queue<Integer> queue = new PriorityQueue<Integer>(comparator);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        	if (!map.containsKey(nums[i])) {
        		map.put(nums[i], 1);
        		queue.add(nums[i]);
        	}
        }
        int max = queue.poll();
        if (queue.peek() == null) return max;
		int second = queue.poll();
    	if (queue.peek() == null) return max;
    	int third = queue.poll();
        // System.out.println(max + " " + second + " " + third);
    	return third;
    }
}
	