class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] combined = new int[nums.length*2];
        System.arraycopy(nums, 0, combined, 0, nums.length);
        System.arraycopy(nums, 0, combined, nums.length, nums.length);
        int curr = 0;
        int numsLen = combined.length;
        int subArrayLen = 0;

        for (int i = 0; i < numsLen; i++) {

            curr += combined[i];
            subArrayLen++;

            if (curr > max) {
                max = curr;
            }

            if (curr < 0) {
                curr = 0;
                subArrayLen = 0;
            }

            if (subArrayLen >= nums.length) {
                System.out.println(String.valueOf(curr));
                curr = curr-combined[i-(nums.length) + 1];
                System.out.println(String.valueOf(combined[i-(nums.length) + 1]));

                if (curr > max) {
                    max = curr;
                }

                subArrayLen--;

                // curr = (combined[i % numsLen] > 0) ? combined[i % numsLen] : 0;
                // subArrayLen = (combined[i % numsLen] > 0) ? 1 : 0;
            }

        }

        return max;
    }
}