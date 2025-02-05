class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < k; j++) {
            max = nums[0];
            int maxLoc = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    maxLoc = i;
                }
            }

            System.out.println("max");
            System.out.println(String.valueOf(max));
            System.out.println(String.valueOf(maxLoc));
            System.out.println(String.valueOf(nums.length));

            if (maxLoc == (nums.length - 1)) {
                int[] newNums = new int[nums.length - 1];
                // System.arraycopy(nums, 0, nums, 0, 0);
                for (int m = 0; m < nums.length - 1; m++) {
                    newNums[m] = nums[m];
                }
                nums = newNums;
            } else {
                System.arraycopy(nums, maxLoc + 1, nums, maxLoc, nums.length - 1 - maxLoc);
            }

            for (int m = 0; m < nums.length; m++) {
                System.out.println(String.valueOf(nums[m]));
            }
        }

        // for (int m = 0; m < nums.length; m++) {
        //     System.out.println(String.valueOf(nums[m]));
        // }
        
        return max;
    }
}