class Solution {
    int[] calculated = new int[1000];

    public int stepCounter(int n){
        if (n < 2) {
            return n;
        }

        if (calculated[n] != 0) {
            return calculated[n];
        }

        else {
            calculated[n] = stepCounter(n - 1) + stepCounter(n - 2);
            return calculated[n];
        }
    }

    public int climbStairs(int n) {
        return stepCounter(n + 1);
    }
}