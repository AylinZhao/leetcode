class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> maplen = new HashMap<>();
        HashMap<Integer, Integer> mapnum = new HashMap<>();
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int occur = map.get(nums[i]);
                maplen.put(nums[i], i - occur + 1);
                int n = mapnum.get(nums[i]);
                mapnum.put(nums[i], n + 1);
                max = Math.max(max, n + 1);
            } else {
                map.put(nums[i], i);
                mapnum.put(nums[i], 1);
                maplen.put(nums[i], 1);
            }
        }
        int res = Integer.MAX_VALUE;
        Iterator iter = mapnum.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer,Integer>) iter.next();
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            if (val.intValue() == max) {
                res = Math.min(res, maplen.get(key));
                // System.out.print("res : " + res);
            }
        }
        return res;
    }
}
    
