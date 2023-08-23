public class FiftyFive {
    public static boolean canJump(int[] nums) {
        boolean reachedEnd = false;
        int position = 0;

        while (position < (nums.length - 1)) {
            if (nums[position] != 0) {
                position = position + nums[position];
            } else {
                int originalPosition = position;
                inverseloop: for (int i = (position - 1); i >= 0; i--) {
                    if (nums[i] > position - i) {
                        position = i + nums[i];
                        i = -1;
                        break inverseloop;
                    }
                }

                if (originalPosition == position) {
                    return reachedEnd;
                }
            }
        }

        reachedEnd = true;
        return reachedEnd;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 0, 0 };
        int[] nums2 = { 3, 2, 1, 0, 4 };
        int[] nums3 = { 2, 2, 0, 2, 0, 2, 0, 0, 2, 0 };
        System.out.println(canJump(nums));
        System.out.println(canJump(nums2));
        System.out.println(canJump(nums3));
    }
}
