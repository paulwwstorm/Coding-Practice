import java.util.HashMap;

class Solution {
    public HashMap<Boolean, HashMap<Integer, String[]>> islandExplore(char[][] board, int x, int y, HashMap<Boolean, HashMap<Integer, int[]>> land) {
        if (land.containsKey(true)) {
            land.get(true).put(land.get(true).size(), new int[]{x,y})
        } else {
            land.get(false).put(land.get(true).size(), new int[]{x,y});
        }

        if (x - 1 < 0 ||
            x + 1 >= board[0].length ||
            y - 1 < 0 ||
            y + 1 >= board.length
        ) {
            if (land.containsKey(false)) {
                int[][] penisula = land.get(false);
                land.clear();
                land.put(true, penisula);
            }
        }

        if ()
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