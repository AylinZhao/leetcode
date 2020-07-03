class Solution {
    public void gameOfLife(int[][] board) {
    	if (board == null || board.length == 0 || board[0].length == 0) return;
    	int[] preline = new int[board.length];
    	int[] nowline = new int[board.length];
    	int prenode = 0;
    	int[][] neighborhood = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1},{1, -1}, {1, 0}, {1, 1}};
    	for (int i = 0; i < board.length; i++) {
    		// int[] nowline = new int[board.length];
            nowline = board[i].clone();
    		for (int j = 0; j < board[0].length; j++) {
    			int sum = count(neighborhood, i, j, board, preline, prenode);
                // if (i == 1 && j == 0) System.out.println("sum : " + sum + "current node : " + board[i][j]);
    			prenode = board[i][j];
    			if (sum == 3) board[i][j] = 1;
    			if (sum < 2 || sum > 3) board[i][j] = 0;
    		}
    		preline = nowline.clone();
    	}
    }
    public int count(int[][] neighborhood, int m, int n, int[][] board, int[] preline, int prenode) {
    	int sum = 0;
    	for (int i = 0; i < neighborhood.length; i++) {
			if (neighborhood[i][0] + m < 0 || neighborhood[i][0] + m >= board.length) continue;
			if (neighborhood[i][1] + n < 0 || neighborhood[i][1] + n >= board[0].length) continue;
    		if (neighborhood[i][0] == -1) {
                // if (m == 1 && n == 0) System.out.println("+ 1 preline:" + preline[neighborhood[i][1] + n]);
    			sum += preline[neighborhood[i][1] + n];
    			continue;
    		}
    		if (neighborhood[i][0] == 0 && neighborhood[i][1] == -1) {
                // if (m == 1 && n == 0) System.out.println("+ 1 prenode:" + prenode);
    			sum += prenode;
    			continue;
    		}
            // if (m == 1 && n == 0) System.out.println("+ 1 normal:" + board[neighborhood[i][0] + m][neighborhood[i][1] + n]);
    		sum += board[neighborhood[i][0] + m][neighborhood[i][1] + n];
    	}
    	return sum;
    }
}