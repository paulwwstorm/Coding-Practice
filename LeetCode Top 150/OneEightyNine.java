import java.util.Arrays;

class OneEightyNine {
    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] front = new int[nums.length - k];
        int[] back = new int[k];

        System.arraycopy(nums, 0, front, 0, nums.length - k);
        System.arraycopy(nums, nums.length - k, back, 0, k);

        System.arraycopy(back, 0, nums, 0, back.length);
        System.arraycopy(front, 0, nums, back.length, front.length);

    }

    // Too slow
    public static void rotateInPlace(int[] nums, int k) {
        int l;
        int m;
        int numsLen = nums.length;

        for (int i = 0; i < k; i++) {
            l = nums[0];
            m = nums[numsLen - 1];

            for (int j = 0; j < numsLen - 1; j++) {
                nums[j] = m;
                m = l;
                l = nums[j + 1];
            }

            nums[numsLen - 1] = m;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        rotateInPlace(nums, 3);
        System.out.println(Arrays.toString(nums));
        int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        rotate(nums2, 3);
        System.out.println(Arrays.toString(nums2));
    }
}
