public class TwoHundred {
    class Solution {
        public char[][] islandExplorer(char[][] grid, int x, int y) {
            grid[x][y] = 2;
            if ((x-1) > 0 && grid[x-1][y] == '1') {
                islandExplorer(grid, x-1, y);
            }
            if ((y-1) > 0 && grid[x][y-1] == '1') {
                islandExplorer(grid, x, y-1);
            }
            if ((x+1) < grid[0].length && grid[x+1][y] == '1') {
                islandExplorer(grid, x-1, y);
            }
            if ((y+1) < grid[1].length && grid[x][y+1] == '1') {
                islandExplorer(grid, x, y-1);
            }
            return grid;
        }

        public int numIslands(char[][] grid) {
            // Go through graph left to right, top to bottom

            // Number of islands found
            int islandCounter = 0;

            for (int i = 0; i > grid[0].length; i++) {
                for (int j = 0; j > grid[1].length; i++) {
                    if (grid[i][j] == '1') {
                        System.out.println("land ho!");
                        islandCounter++;
                        grid = islandExplorer(grid, i, j);
                    }
                }
            }
            // When land is found, add it to a new island
            // Check space below land for land
            // If land found, add to island, check below again
            // When land is no longer found below, check to the right of the original square
            // If land is found, add to island, check right again
            // Once the end of the land right is found, island is complete
            // Close island, move to next square and look for land
            // At the end count up the islands
            return islandCounter;
        }
    }
}

// {
//     int[][] land = new int[(grid.length * grid[0].length)][];
//     int landCount = 0;
//     int islandCount = 0;
//     for (int i = 0; i < grid.length; i++) {
//         for (int j = 0; j < grid[0].length; j++) {
//             if (grid[i][j] == '1'.charAt(0)) {
//                 int[] newLand = {i, j};
//                 land[landCount] = newLand;
//                 landCount++;
//             }
//         }
//     }
//     for (int k = 0; k < landCount - 1; k++) {
//         int[] currentLand = land[k];
//         System.out.println('[' + String.valueOf(currentLand[0]) + ', ' + String.valueOf(currentLand[1]) + ']');
//         islandCount++;
//         if (k == (landCount - 2)) {
//             continue;
//         }
//         land = landRemover(land, currentLand);
//         for (l = 1; l < grid.length; l++) {
//             if ((currentLand[0] == land[k+l][0] - 1 )
//         }
//     }
//     return islandCount;                 
// }