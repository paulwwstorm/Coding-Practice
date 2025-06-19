class Solution {
    public void islandExplore(char[] board, int x, int y, HashMap peninsulas) {
        HashMap<Integer, String> currentLand = new HashMap<Integer, String>();
        int[][] toConvert = new int[][];
        boolean isIsland = true;

        while(true) {
            if (currLoc[0] - 1 < 0 ||
                currLoc[0] + 1 >= board[0].length ||
                currLoc[1] - 1 < 0 ||
                currLoc[1] + 1 >= board[1].length
            ) {
                isIsland = false;
            } else ()
        }


    }
    public void solve(char[][] board) {
        HashMap<Integer, String> peninsulas = new HashMap<Integer, String>();
        for (int i = 0; i < char.length; i++) {
            for (int j = 0; j < char[i].lenght; j++) {
                if (char[i][j] == "O" && penisulas.containsValue()) {
                    islandExplore(board, char[i][j], peninsulas);
                }
            }
        }
    }
}