class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

        }
        int elem = findelem(map, k, min, max);
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Integer key = (Integer) entry.getKey();
            Integer val = (Integer) entry.getValue();
             if (val >= elem) {
                list.add(key);
            }
        }
        int[] res = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;
    }
    public int findnums(HashMap<Integer, Integer> map, int mid) {
        int right = 0;
        for (Integer val : map.values()) {
             if (val >= mid) {
                right++;
            } 
        }
        return right;
    }
    public int findelem(HashMap<Integer, Integer> map, int k, int min, int max) {
        int low = min;
        int high = max;
        while (low < high) {
            int mid = (low + high) / 2;
            int right = findnums(map, mid);
            if (right > k) {
                low = mid + 1;
            } else if (right < k) {
                high = mid;
            } else if (right == k) {
                return mid;
            }
        }
        return low;
    }
}
