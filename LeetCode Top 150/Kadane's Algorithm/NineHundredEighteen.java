class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] combined = new int[nums.length*2];
        System.arraycopy(nums, 0, combined, 0, nums.length);
        System.arraycopy(nums, 0, combined, nums.length, nums.length);
        int curr = 0;
        int numsLen = combined.length;
        int subArrayLen = 0;

        for (int h = 0; h < nums.length; h++) {
            curr = 0;

            for (int i = h; i < nums.length+h; i++) {

                curr += combined[i];
                if (curr > max) {
                    max = curr;
                }

                if (curr < 0) {
                    curr = 0;
                }

            }
        }

        return max;
    }
}