class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) map.put(nums1[i], 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j]) && map.get(nums2[j]) == 1){
                list.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j])+ 1);
            } 
        }
        int[] array =new int[list.size()];
        for (int m = 0; m < list.size(); m++) {
            array[m] = list.get(m);
        }
        return array;
    }
}
