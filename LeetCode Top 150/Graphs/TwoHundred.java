public class TwoHundred {
    class Solution {
        public int numIslands(char[][] grid) {
            // System.out.println(String.valueOf(grid.length * grid[0].length));
            char[] land = new char[(grid.length * grid[0].length)];
            int landCount = 0;
    
            for (int i = 0; i < grid[0].length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    if (char[j][i] == "1") {
                        landCount++;
                        land[landCount] = 
                    }
                }
            }
            return 1;
        }
    }
}
