class Solution {
    public int minPathSum(int[][] grid) {
    	if (grid == null || grid.length == 0) return 0;
    	int m = grid.length;
    	int n = grid[0].length;
    	int[][] sum = new int[m][n];
    	sum[0][0] = grid[0][0];
    	for (int x = 0; x < m; x++) {
    		for (int y = 0; y < n; y++) {
    			if (x == 0 && y != 0) sum[x][y] = sum[x][y - 1] + grid[x][y]; 
    			if (x != 0 && y == 0) sum[x][y] = sum[x - 1][y] + grid[x][y];
    			if (x != 0 && y != 0)sum[x][y] = Math.min(sum[x - 1][y], sum[x][y - 1]) + grid[x][y]; 
    		}
    	}
    	return sum[m - 1][n - 1];
    }
}