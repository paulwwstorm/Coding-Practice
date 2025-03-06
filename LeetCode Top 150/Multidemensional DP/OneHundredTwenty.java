class Solution {

    public int pathfinder(List<List<Integer>> triangle, int row, int position) {
            if (row + 1 == triangle.size()) {
                return triangle.get(row).get(position);
            } else {
                int left = pathfinder(triangle, row + 1, position);
                int right = pathfinder(triangle, row + 1, position + 1);
                int value = (left > right) ? right : left;

                return triangle.get(row).get(position) + value;
            }

    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int smallest = pathfinder(triangle, 0, 0);

        return smallest;

    }
}

class Solution {
    int smallestPath = Integer.MAX_VALUE;

    public void pathfinder(List<List<Integer>> triangle, int row, int position, int currTotal) {
            currTotal += triangle.get(row).get(position);
            if (row + 1 == triangle.size()) {
                if (currTotal < smallestPath) {
                    smallestPath = currTotal;
                }
            } else {
                pathfinder(triangle, row + 1, position, currTotal);
                pathfinder(triangle, row + 1, position + 1, currTotal);
            }

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        pathfinder(triangle, 0, 0, 0);
        return smallestPath;

    }
}

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] paths = new int[triangle.size()][0];
        int[] firstRow = new int[1];
        firstRow[0] = triangle.get(0).get(0);
        paths[0] = firstRow;

        for (int i = 1; i < triangle.size(); i++) {
            int[] row = new int[triangle.get(i).size()];
            paths[i] = row;
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                if (j > 0) {
                    right = paths[i-1][j - 1];
                }
                
                if (j < paths[i-1].length - 1) {
                    left = paths[i-1][j];
                }
                int shortest = right < left ? right : left;
                paths[i][j] = shortest + triangle.get(i).get(j);
            }
        }

        return Arrays.stream(paths[paths.length - 1]).min().getAsInt();

    }
}