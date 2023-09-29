public class OneTwentyTwo {

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 5, 3, 4, 1, 6, 4 };
        int[] nums2 = { 7, 1, 2, 4, 5, 3, 4, 1, 6, 4 };
        int[] nums3 = { 5, 6, 7, 2, 3, 6 };

        // 1 1 2 3 4 4 4 5 6 i
        // 6 5 4 4 4 3 2 1 1 j
        System.out.println(maxProfit(nums1));
        System.out.println(maxProfit(nums2));
        System.out.println(maxProfit(nums3));
    }

}
