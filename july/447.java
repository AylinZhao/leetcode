class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if (points == null || points.length == 0) return 0;        
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0;j < points.length; j++) {
                if (j == i) continue;
                int ret = calDistance(points[i][0], points[i][1], points[j][0], points[j][1]);   
                // System.out.println("ret is : "+ ret);            
                if (map.containsKey(ret)) map.put(ret, map.get(ret) + 1);
                else map.put(ret, 1);
            }
            if (map.isEmpty()) continue;
            for(Integer v : map.values()){
                int value = v.intValue();                
                if (value > 1) {
                    res += value * (value - 1);
                }
            }
        }
        return res;
    }
    public int calDistance(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}
// n = 500
//[[1,1],[1,2]]