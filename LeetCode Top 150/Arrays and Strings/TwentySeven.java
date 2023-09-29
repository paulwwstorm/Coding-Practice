//Solution using System.arraycopy()
class TwentySeven {
    public static int removeElement(int[] nums, int val) {
        int remaining = nums.length;
        for (int i = 0; i < remaining; i++) {
            if (nums[i] == val) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - (i + 1));
                i--;
                remaining--;
            }
        }
        return (remaining);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 3, 4, 1, 6, 4 };
        System.out.println(removeElement(nums, 4));
    }
}