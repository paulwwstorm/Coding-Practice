public class TwoHundredAndNine {
    public static int minSubArrayLen(int target, int[] nums) {
        int length = nums.length + 1;
        int arrBeginning = 0;
        int arrEnd = 0;
        int currSum = 0;

        while (arrEnd < nums.length) {
            currSum = currSum + nums[arrEnd];

            if (currSum >= target) {
                while (arrBeginning < arrEnd) {
                    if (currSum - nums[arrBeginning] >= target) {
                        currSum = currSum - nums[arrBeginning];
                        arrBeginning += 1;
                    } else {
                        break;
                    }
                }
                if ((arrEnd - arrBeginning + 1) < length) {
                    length = (arrEnd - arrBeginning) + 1;
                }
            }
            arrEnd += 1;
        }

        if (length == (nums.length + 1)) {
            return 0;
        } else {
            return length;
        }
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