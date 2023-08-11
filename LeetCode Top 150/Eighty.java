import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//Not big changes from problem 88
class Eighty {
    public static int removeDuplicates(int[] nums) {
        int remaining = nums.length;
        for (int i = 0; i < remaining - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                System.arraycopy(nums, i + 1, nums, i, remaining - (i + 1));
                i--;
                remaining--;
            }
        }
        return (remaining);
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 3, 4, 5, 5 };
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}