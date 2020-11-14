class Solution {
    public boolean exist(char[][] board, String word) {
    	boolean[][] state = new boolean[board.length][board[0].length];
    	for (int i = 0; i < board.length; i++) {
    		for (int j = 0; j < board[i].length; j++) {
    			if (board[i][j] == word.charAt(0)) {
    				state[i][j] = true;
    				if (dfs(board, word, 0, i, j, state)) return true;
    				state[i][j] = false;
    			} 
    		}
    	}
    	return false;
    }
    public boolean dfs(char[][] board, String word, int cur, int i, int j, boolean[][] state) {
    	if (cur == word.length() - 1) return true;
    	int[][] d = {{-1, 0},{1, 0},{0, -1},{0, 1}};
    	for (int k = 0; k < d.length; k++) {
    		int xd = d[k][0] + i;
    		int yd = d[k][1] + j;
    		if (xd < 0 || xd == board.length) continue;
    		if (yd < 0 || yd == board[0].length) continue;
    		if (state[xd][yd] == false && board[xd][yd] == word.charAt(cur + 1)) {
    			state[i][j] = true;
    			if(dfs(board, word, cur + 1, xd, yd, state)) return true;
    			state[i][j] = false;
    		}
    	}
    	return false;
    }

}