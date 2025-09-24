class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[] complete = new int[k-1];
        int highest = 0;
        int project = -1;
        int projects = profits.length-1;
        int projectCount = k < profits.length ? k : profits.length;

        for (int i = 0; i < projectCount; i++) {
            for (int j = 0; j <= projects; j++) {
                if (capital[j] <= w) {
                    if (profits[j] > highest) {
                        highest = profits[j];
                        project = j;
                    }
                }
            }

            if (project >= 0) {
                System.out.println("Project value: " + String.valueOf(highest));
                w += highest;
                int temp = profits[projects];
                profits[project] = profits[projects];
                profits[projects] = temp;
                temp = capital[projects];
                capital[project] = capital[projects];
                capital[projects] = temp;
                projects--;
            }
        }

        return w;
    }
}