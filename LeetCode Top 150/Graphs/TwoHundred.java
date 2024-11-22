public class TwoHundred {
    class Solution {
        public char[][] islandExplorer(char[][] grid, int x, int y) {
            grid[x][y] = 2;
            if ((x) > 0 && grid[x-1][y] == '1') {
                islandExplorer(grid, x-1, y);
            }
            if ((y) > 0 && grid[x][y-1] == '1') {
                islandExplorer(grid, x, y-1);
            }
            if ((x+1) < grid.length && grid[x+1][y] == '1') {
                islandExplorer(grid, x+1, y);
            }
            if ((y+1) < grid[0].length && grid[x][y+1] == '1') {
                islandExplorer(grid, x, y+1);
            }
            return grid;
        }

        public int numIslands(char[][] grid) {
            int islandCounter = 0;

            for (int i = 0; i < grid[0].length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    if (grid[j][i] == '1') {
                        islandCounter++;
                        grid = islandExplorer(grid, j, i);
                    }
                }
            }
            return islandCounter;
        }
}
}