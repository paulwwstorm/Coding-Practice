public class TwoHundred {
    class Solution {
        public int numIslands(char[][] grid) {
            int[][] land = new int[(grid.length * grid[0].length)][];
            int landCount = 0;
            int islandCount = 0;
    
            for (int i = 0; i < grid[0].length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    if (grid[j][i] == "1".charAt(0)) {
                        land[landCount] = new int[]{Character.getNumericValue(j),Character.getNumericValue(i)};
                        landCount++;
                    }
                }
            }
    
            System.out.println(String.valueOf(landCount));
    
            for (int k = 0; k < landCount; k++) {
                int[] currentLand = land[k];
                if (landCount == 1) {
                    return islandCount++;
                };
                
                if ((currentLand[0] == land[k+1][0] - 1 ) && (true)) {
                    System.out.println("True");
                } 
    
                landCount--;
            }
    
            return islandCount;
        }
    }
}
