class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int currDirection = 0;
        int xCoord = 0;
        int yCoord = 0;
        List<String> visited = new ArrayList<String>();
        List<Integer> output = new ArrayList<Integer>();
        int currLoc = 0;

        while (true) {
            System.out.println("next round:");
            System.out.println(String.valueOf(currDirection));
            System.out.println(String.valueOf(xCoord));
            System.out.println(String.valueOf(yCoord));

            if (currDirection == 0) {
                if (visited.indexOf(String.valueOf(xCoord) + "," + String.valueOf(yCoord)) < 0 & xCoord < matrix.length) {
                    System.out.println(String.valueOf(matrix[yCoord][xCoord]));
                    output.add(matrix[yCoord][xCoord]);
                    visited.add(String.valueOf(xCoord) + "," + String.valueOf(yCoord));
                    xCoord++;
                    currLoc++;
                } else if (xCoord >= matrix.length) {
                    xCoord--;
                    currDirection = 1;
                } else {
                    currDirection = 1;
                }
            } else if (currDirection == 1) {
                if (visited.indexOf(String.valueOf(xCoord) + "," + String.valueOf(yCoord)) < 0 & yCoord < matrix[0].length) {
                    System.out.println(String.valueOf(matrix[yCoord][xCoord]));
                    output.add(matrix[yCoord][xCoord]);
                    visited.add(String.valueOf(xCoord) + "," + String.valueOf(yCoord));
                    yCoord++;
                    currLoc++;
                } else if (yCoord >= matrix[0].length) {
                    yCoord--;
                    currDirection = 2;
                } else {
                    currDirection = 2;
                }
            } else if (currDirection == 2) {
                if (visited.indexOf(String.valueOf(xCoord) + "," + String.valueOf(yCoord)) < 0 & xCoord >= 0) {
                    System.out.println(String.valueOf(matrix[yCoord][xCoord]));
                    output.add(matrix[yCoord][xCoord]);
                    visited.add(String.valueOf(xCoord) + "," + String.valueOf(yCoord));
                    xCoord--;
                    currLoc++;
                } else if (xCoord < 0) {
                    xCoord++;
                    currDirection = 3;
                } else {
                    currDirection = 3;
                }
            } else if (currDirection == 3) {
                if (visited.indexOf(String.valueOf(xCoord) + "," + String.valueOf(yCoord)) < 0) {
                    System.out.println(String.valueOf(matrix[yCoord][xCoord]));
                    output.add(matrix[yCoord][xCoord]);
                    visited.add(String.valueOf(xCoord) + "," + String.valueOf(yCoord));
                    yCoord--;
                    currLoc++;
                } else {
                    currDirection = 0;
                }
            }

            if (currLoc + 1 == (matrix.length * matrix[0].length)) {
                return output;
            }
        }
        
    }
}