public class TwoHundred {
    class Solution {
        public int numIslands(char[][] grid) {
            // Go through graph left to right, top to bottom

            int[] currentLocation = { 0, 0 };

            while (currentLocation[0] > grid[0].length) {
                while (currentLocation[1] > grid[1].length) {
                    
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
            return 1;
        }
    }
}

// {
//     int[][] land = new int[(grid.length * grid[0].length)][];
//     int landCount = 0;
//     int islandCount = 0;
//     for (int i = 0; i < grid.length; i++) {
//         for (int j = 0; j < grid[0].length; j++) {
//             if (grid[i][j] == "1".charAt(0)) {
//                 int[] newLand = {i, j};
//                 land[landCount] = newLand;
//                 landCount++;
//             }
//         }
//     }
//     for (int k = 0; k < landCount - 1; k++) {
//         int[] currentLand = land[k];
//         System.out.println("[" + String.valueOf(currentLand[0]) + ", " + String.valueOf(currentLand[1]) + "]");
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