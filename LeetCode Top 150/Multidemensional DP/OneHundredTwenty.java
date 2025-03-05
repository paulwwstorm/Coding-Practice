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