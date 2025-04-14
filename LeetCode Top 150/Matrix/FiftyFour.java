class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int currDirection = 0;
        int yCoord = 0;
        int xCoord = 0;
        List<String> visited = new ArrayList<String>();
        List<Integer> output = new ArrayList<Integer>();
        int currLoc = 0;

        while (true) {
            System.out.println("next round:");
            System.out.println(String.valueOf(currDirection));
            System.out.println(String.valueOf(yCoord));
            System.out.println(String.valueOf(xCoord));

            if (currDirection == 0) {
                if (visited.indexOf(String.valueOf(yCoord) + "," + String.valueOf(xCoord)) < 0 & yCoord < matrix[0].length) {
                    System.out.println(String.valueOf(matrix[xCoord][yCoord]));
                    output.add(matrix[xCoord][yCoord]);
                    visited.add(String.valueOf(yCoord) + "," + String.valueOf(xCoord));
                    yCoord++;
                    currLoc++;
                } else {
                    yCoord--;
                    xCoord++;
                    currDirection = 1;
                }
            } else if (currDirection == 1) {
                if (visited.indexOf(String.valueOf(yCoord) + "," + String.valueOf(xCoord)) < 0 & xCoord < matrix.length) {
                    System.out.println(String.valueOf(matrix[xCoord][yCoord]));
                    output.add(matrix[xCoord][yCoord]);
                    visited.add(String.valueOf(yCoord) + "," + String.valueOf(xCoord));
                    xCoord++;
                    currLoc++;
                } else {
                    xCoord--;
                    yCoord--;
                    currDirection = 2;
                }                    
            } else if (currDirection == 2) {
                if (visited.indexOf(String.valueOf(yCoord) + "," + String.valueOf(xCoord)) < 0 & yCoord >= 0) {
                    System.out.println(String.valueOf(matrix[xCoord][yCoord]));
                    output.add(matrix[xCoord][yCoord]);
                    visited.add(String.valueOf(yCoord) + "," + String.valueOf(xCoord));
                    yCoord--;
                    currLoc++;
                }  else {
                    yCoord++;
                    xCoord--;
                    currDirection = 3;
                }
            } else if (currDirection == 3) {
                if (visited.indexOf(String.valueOf(yCoord) + "," + String.valueOf(xCoord)) < 0) {
                    System.out.println(String.valueOf(matrix[xCoord][yCoord]));
                    output.add(matrix[xCoord][yCoord]);
                    visited.add(String.valueOf(yCoord) + "," + String.valueOf(xCoord));
                    xCoord--;
                    currLoc++;
                } else {
                    xCoord++;
                    yCoord++;
                    currDirection = 0;
                }
            }

            if (currLoc == (matrix.length * matrix[0].length)) {
                return output;
            }
        }
        
    }
}
