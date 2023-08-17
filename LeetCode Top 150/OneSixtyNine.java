import java.util.Arrays;

public class OneSixtyNine {
    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int n = nums.length / 2;
        Arrays.sort(nums);

        for (int i = 0; i < n + 1; i++) {
            if (nums[i] == nums[i + (n / 2)]) {
                majorityElement = nums[i];
                break;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 5 };
        System.out.println(majorityElement(nums));
    }
}
