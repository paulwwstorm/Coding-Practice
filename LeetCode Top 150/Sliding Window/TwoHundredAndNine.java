public class TwoHundredAndNine {
    public static int minSubArrayLen(int target, int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        int target1 = 7;
        int[] nums1 = { 2, 3, 1, 2, 4, 3 };
        int target2 = 4;
        int[] nums2 = { 1, 4, 4 };
        int target3 = 11;
        int[] nums3 = { 1, 1, 1, 1, 1, 1, 1, 1 };

        System.out.println(minSubArrayLen(target1, nums1));
        System.out.println(minSubArrayLen(target2, nums2));
        System.out.println(minSubArrayLen(target3, nums3));
    }
}