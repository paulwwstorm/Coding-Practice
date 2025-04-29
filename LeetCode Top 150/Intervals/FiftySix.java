class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] nonOverlapping = new int[intervals.length][2];
        int currStart = intervals[0][0];
        int intervalsCount = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i-1][1] < intervals[i][0]) {
                nonOverlapping[intervalsCount] = new int[]{currStart, intervals[i-1][1]};
                intervalsCount++;
                currStart = intervals[i][0];
            }
        }

        nonOverlapping[intervalsCount]= new int[]{currStart, intervals[intervals.length-1][1]};
        intervalsCount++;

        int[][] finalArray = new int[intervalsCount][2];

        for (int j = 0; j < intervalsCount; j++) {
            finalArray[j] = nonOverlapping[j];
        }

        return finalArray;   
    }
}
