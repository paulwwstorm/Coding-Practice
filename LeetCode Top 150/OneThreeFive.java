import java.util.Arrays;

public class OneThreeFive {
    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        int totalCandy = ratings.length;
        int adjustments = 1;

        if (ratings.length == 1) {
            return 1;
        }

        while (adjustments != 0) {
            adjustments = 0;
            if (ratings[0] > ratings[1] & candies[0] <= candies[1]) {
                candies[0] += 1;
                totalCandy += 1;
                adjustments += 1;
            }
            if (ratings[ratings.length - 1] > ratings[ratings.length - 2]
                    & candies[ratings.length - 1] <= candies[ratings.length - 2]) {
                candies[ratings.length - 1] += 1;
                totalCandy += 1;
                adjustments += 1;
            }
            for (int i = 1; i < ratings.length - 1; i++) {
                if (((ratings[i] > ratings[i - 1]) & (candies[i] <= candies[i - 1]))
                        || ((ratings[i] > ratings[i + 1]) & (candies[i] <= candies[i + 1]))) {
                    candies[i] += 1;
                    totalCandy += 1;
                    adjustments += 1;
                }
            }
        }

        return totalCandy;
    }

    public static void main(String[] args) {
        int[] ratings1 = { 1, 0, 2 };
        int[] ratings2 = { 1, 2, 2 };
        System.out.println(candy(ratings1));
        System.out.println(candy(ratings2));
    }
}
