public class FortyFive {
    public static int jump(int[] nums) {
        int jumps = 0;
        int position = 0;
        int currentJump = nums[0];

        if (position != nums.length - 1) {
            jumps++;
            while (position < nums.length - 2) {
                if (position + currentJump >= (nums.length - 1)) {
                    position += currentJump;
                    return jumps;
                }
                position++;
                currentJump--;
                if (currentJump < nums[position]) {
                    jumps++;
                    currentJump = nums[position];
                }
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 1, 1, 4 };
        int[] nums2 = { 2, 3, 0, 1, 4 };
        int[] nums3 = { 2, 3, 1 };
        System.out.println(jump(nums1));
        System.out.println(jump(nums2));
        System.out.println(jump(nums3));
    }
}
