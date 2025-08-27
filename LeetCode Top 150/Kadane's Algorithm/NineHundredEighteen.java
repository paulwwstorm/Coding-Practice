class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int numsLen = nums.length;
        int subArrayLen = 0;

        for (int i = 0; i < numsLen*2; i++) {

            curr += nums[i % numsLen];
            subArrayLen++;

            if (curr > max) {
                max = curr;
            }

            if (curr < 0) {
                curr = 0;
                subArrayLen = 0;
            }

            if (subArrayLen+1 == numsLen) {
                curr = (nums[i % numsLen] > 0) ? nums[i % numsLen] : 0;
                subArrayLen = (nums[i % numsLen] > 0) ? 1 : 0;
            }

        }

        return max;
    }
}