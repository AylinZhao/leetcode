class Solution {
    public int islandPerimeter(int[][] grid) {
    	if (grid == null || grid.length == 0) return 0;
    	int[][] d = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    	int res = 0;
    	for (int i = 0; i < grid.length; i++) {
    		for (int j = 0; j < grid[0].length; j++) {
    			if (grid[i][j] == 1) res += cal(d, grid, i, j);
    		}
    	}
    	return res;
    }
    public int cal(int[][] d, int[][] grid, int m, int n) {
    	int cube = 0;
    	for (int i = 0; i < d.length; i++) {
    		int x = m + d[i][0];
    		int y = n + d[i][1];
    		if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) {
                cube++;
                continue;
            }
			if (grid[x][y] == 0) {
				cube++;
			} else continue;
    	}	
    	return cube;
    }
}