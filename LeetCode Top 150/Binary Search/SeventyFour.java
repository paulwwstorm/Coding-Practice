class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int row = i;
            if (target >= matrix[row][0] && target <= matrix[row][matrix[0].length - 1]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[row][j] == target) {
                        return true;
                    }
                }
            } else if (target < matrix[row][0]) {
                return false;
            }
        }

        return false;
    }
}