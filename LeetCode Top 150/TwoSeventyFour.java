import java.util.Arrays;

public class TwoSeventyFour {

    public static int hIndex(int[] citations) {
        int potentialHValue = citations.length;

        for (int i = 0; i < citations.length; i++) {
            int currentCitationCount = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= potentialHValue) {
                    currentCitationCount++;
                }
            }

            if (currentCitationCount >= potentialHValue) {
                return potentialHValue;
            } else {
                potentialHValue--;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 0, 6, 1, 5 };
        int[] nums2 = { 1, 3, 1 };
        System.out.println(hIndex(nums1));
        System.out.println(hIndex(nums2));
    }

}
