import java.util.Arrays;
import java.util.List;

public class OneTwentyOne {

    // Double For Loops
    // public static int slowMaxProfit(int[] prices) {
    // int maxDiff = 0;

    // for (int i = 0; i < prices.length - 1; i++) {
    // for (int j = i + 1; j < prices.length; j++) {
    // if ((prices[j] - prices[i]) > 0 && (prices[j] - prices[i]) > maxDiff) {
    // maxDiff = prices[j] - prices[i];
    // }
    // }
    // }

    // return maxDiff;
    // }

    // With extra space
    // public static int maxProfit(int[] prices) {
    // int[] orderedPrices = prices;
    // int[] pricesList = prices;
    // Arrays.asList(pricesList);
    // Arrays.sort(orderedPrices);
    // int maxDiff = 0;

    // for (int i = 0; i < orderedPrices.length; i++) {
    // if (orderedPrices[orderedPrices.length - (i + 1)] - orderedPrices[i] < 1 ) {
    // return maxDiff;
    // } else if (list.indexOf()
    // return list.indexOf(target);

    // }

    // return maxDiff;
    // }

    public static int maxProfitThree(int[] prices) {
        int maxDiff = 0;
        int currentMinIndex = 0;
        int currentMaxIndex = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if ((i < currentMaxIndex) && prices[i] < prices[currentMinIndex]) {
                currentMinIndex = i;
                maxDiff = prices[currentMaxIndex] - prices[i];
            } else {
                for (int j = i + 1; j < prices.length; j++) {
                    if ((prices[j] - prices[i]) > 0 && (prices[j] - prices[i]) > maxDiff) {
                        currentMaxIndex = j;
                        currentMinIndex = i;
                        maxDiff = prices[j] - prices[i];
                    }
                }
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 3, 4, 1, 6, 4 };
        System.out.println(maxProfitThree(nums));
    }
}
