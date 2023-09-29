class TwentySix {
    public static int removeDuplicates(int[] nums) {
        int remaining = nums.length;
        for (int i = 0; i < remaining - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - (i + 1));
                i--;
                remaining--;
            }
        }
        return (remaining);
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 3, 4, 5, 5 };
        removeDuplicates(nums);
    }
}