class Solution {
    public void solve(char[][] board) {
        int[] currLoc = {0,0};
        boolean touchEdge = false;
        boolean connected = false;
        if (currLoc[0] - 1 < 0 ||
            currLoc[0] + 1 >= board[0].length ||
            currLoc[1] - 1 < 0 ||
            currLoc[1] + 1 >= board[1].length
        ) {
            touchEdge = true;
        } else ()
    }
}