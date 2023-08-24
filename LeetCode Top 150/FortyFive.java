public class FortyFive {
    public static int jump(int[] nums) {
        int jumps = 0;
        int position = 0;
        int currentJump = nums[0];

        if (position != nums.length - 1) {
            jumps++;
            while (position < nums.length - 2) {
                if (position + currentJump >= (nums.length - 1)) {
                    return jumps;
                }
                jumps++;
                int maxJumpPosition = position + 1;
                int maxJump = nums[position + 1] + 1;
                for (int i = 2; i <= currentJump; i++) {
                    if ((nums[position + i] + i) > maxJump) {
                        maxJumpPosition = position + i;
                        maxJump = nums[position + i] + i;
                    }
                }
                position = maxJumpPosition;
                currentJump = nums[maxJumpPosition];
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 1, 1, 4 };
        int[] nums2 = { 2, 3, 0, 1, 4 };
        int[] nums3 = { 2, 3, 1 };
        int[] nums4 = { 1, 2, 1, 1, 1 };
        int[] nums5 = { 4, 1, 1, 3, 1, 1, 1 };
        System.out.println(jump(nums1));
        System.out.println(jump(nums2));
        System.out.println(jump(nums3));
        System.out.println(jump(nums4));
        System.out.println(jump(nums5));

    }
}
