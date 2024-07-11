public class TwoHundred {
    class Solution {
        public int numIslands(char[][] grid) {
            int[][] land = new int[(grid.length * grid[0].length)][];
            int landCount = 0;
            int islandCount = 0;
    
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == "1".charAt(0)) {
                        int[] newLand = {i, j};
                        land[landCount] = newLand;
                        landCount++;
                    }
                }
            }
    
            // System.out.println(String.valueOf(landCount));
    
            for (int k = 0; k < landCount; k++) {
                int[] currentLand = land[k];
                if (k == (landCount - 1)) {
                    return islandCount++;
                };
                System.out.println("[" + String.valueOf(currentLand[0]) + ", " + String.valueOf(currentLand[1]) + "]");
                if ((currentLand[1] == land[k+1][1] - 1 ) && (true)) {
                    landCount--;
                    continue;
                } else {
    
                }
            }
    
            return islandCount;
        }
    }
}
