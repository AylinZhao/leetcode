class Solution {
    public int countBattleships(char[][] board) {
    	int res = 0;
    	for (int i = 0; i < board.length; i++) {
    		for (int j = 0; j < board[0].length; j++) {
    			if (i == 0 && j == 0) {
    				if (board[i][j] == 'X') res++;
    				continue;
    			}
    			if (i == 0 && j > 0) {
    				if (board[i][j - 1] == '.' && board[i][j] == 'X') res++;
    				continue;
    			}
    			if (j == 0 && i > 0) {
    				if (board[i - 1][j] == '.' && board[i][j] == 'X') res++;
    				continue;
    			}
    			if (board[i][j] == 'X' && board[i - 1][j] == '.' && board[i][j - 1] == '.') {
    				res++;
    			}

    		}
    	}
    	return res;
    }
}