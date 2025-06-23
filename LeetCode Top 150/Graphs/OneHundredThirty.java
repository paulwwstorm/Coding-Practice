class Solution {
    public void islandExplore(char[][] board, int x, int y) {
        board[x][y] = 'Y';


        if (x - 1 >= 0 && board[x-1][y] == 'O') {
            islandExplore(board, x-1, y);
        }

        if (x + 1 < board.length && board[x+1][y] == 'O') {
            islandExplore(board, x+1, y);
        }

        if (y - 1 >= 0 && board[x][y-1] == 'O') {
            islandExplore(board, x, y-1);
        }

        if (y + 1 < board[0].length && board[x][y+1] == 'O') {
            islandExplore(board, x, y+1);
        }
    }

    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || i + 1 == board.length || j == 0 || j + 1 == board[0].length) {
                    if (board[i][j] == 'O') {
                        islandExplore(board, i, j);
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}