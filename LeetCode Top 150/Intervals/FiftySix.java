class Solution {
    public int[][] merge(int[][] intervals) {
        int changes = 1;

        while (changes == 1) {
            changes = 0;
            int[][] nonOverlapping = new int[intervals.length][2];
            int currStart = intervals[0][0];
            int currEnd = intervals[0][1];
            int intervalsCount = 0;

            for (int i = 0; i < intervals.length; i++) {
                if (intervals[i][0] != Integer.MIN_VALUE) {
                    currStart = intervals[i][0];
                    currEnd = intervals[i][1];
                    for (int j = i+1; j < intervals.length; j++) {
                        if ((intervals[j][0] >= currStart && intervals[j][0] <= currEnd) ||
                        (intervals[j][1] >= currStart && intervals[j][1] <= currEnd) ||
                        (intervals[j][0] < currStart && intervals[j][1] > currEnd)) {
                            if (intervals[j][0] < currStart) currStart = intervals[j][0];
                            if (intervals[j][1] > currEnd) currEnd = intervals[j][1];
                            intervals[j][1] = Integer.MIN_VALUE;
                            intervals[j][0] = Integer.MIN_VALUE;
                            changes = 1;
                        }
                    }

                    nonOverlapping[intervalsCount] = new int[]{currStart, currEnd};
                    intervalsCount++;
                }
            } 

            int[][] finalArray = new int[intervalsCount][2];

            for (int j = 0; j < intervalsCount; j++) {
                finalArray[j] = nonOverlapping[j];
            }

            intervals = finalArray;
        }  



        return intervals;   
    }
}