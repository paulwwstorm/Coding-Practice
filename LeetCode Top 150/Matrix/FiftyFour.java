class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int currDirection = 0;
        int xCoord = 0;
        int yCoord = 0;
        List<String> visited = new ArrayList<String>();
        List<Integer> output = new ArrayList<Integer>();
        int currLoc = 0;

        while (true) {}
            if (currDirection == 0) {
                if (visited.indexOf(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)) < 0) {
                    xCoord++;
                    output.add(matrix[yCoord][xCoord]);
                    currLoc++;
                    visisted.add(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)))
                } else {
                    currDirection = 1;
                }
            } else if (currDirection == 1) {
                if (visited.indexOf(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)) < 0) {
                    xCoord++;
                    output.add(matrix[yCoord][xCoord]);
                    currLoc++;
                    visisted.add(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)))
                } else {
                    currDirection = 1;
                }
            } (currDirection == 2) {
                if (visited.indexOf(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)) < 0) {
                    xCoord++;
                    output.add(matrix[yCoord][xCoord]);
                    currLoc++;
                    visisted.add(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)))
                } else {
                    currDirection = 1;
                }
            } (currDirection == 3) {
                if (visited.indexOf(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)) < 0) {
                    xCoord++;
                    output.add(matrix[yCoord][xCoord]);
                    currLoc++;
                    visisted.add(String.valueOf(xCoord + 1) + "," + String.valueOf(yCoord)))
                } else {
                    currDirection = 1;
                }
            }

            if (currLoc == (matrix.length * matrix[0].length)) {
                return output
            }
        
    }
}