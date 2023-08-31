import java.util.Arrays;

public class TwoThirtyEight {
    public static int[] productExceptSelf(int[] nums) {
        int[] solution = new int[nums.length];
        int[] forwards = new int[nums.length];
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            forwards[i] = product;
            product = product * nums[i];
        }

        System.out.println(Arrays.toString(forwards));
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            solution[i] = product * forwards[i];
            product = product * nums[i];
        }

        return solution;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4 };
        int[] nums2 = { -1, 1, 0, -3, 3 };
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}
