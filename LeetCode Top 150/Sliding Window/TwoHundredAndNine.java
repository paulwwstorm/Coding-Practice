public class TwoHundredAndNine {
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 1) {
            if (nums[0] > target) {
                return 1;
            } else {
                return 0;
            }
        }

        int length = nums.length + 1;
        int arrBeginning = 0;
        int arrEnd = 1;
        int currSum = nums[arrBeginning];

        while (arrEnd < nums.length) {
            currSum = currSum + nums[arrEnd];
            // System.out.println(currSum);
            // System.out.println(arrBeginning);
            // System.out.println(arrEnd);
            // System.out.println("\n");
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
                    // System.out.println(arrBeginning);
                    // System.out.println(arrEnd);
                    // System.out.println("\n");
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