import java.util.Arrays;

class Solution {
    // This was a bad idea
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // for (int i = 0; i < nums2.length; i++) {
    // for (int j = i; j < nums1.length; j++) {
    // if (nums1[j] > nums2[i]) {
    // int current = nums2[i];
    // for (int k = j; k < nums1.length; k++) {
    // int next = nums1[k];
    // nums1[k] = current;
    // current = next;
    // if (nums1[k] == 0) {
    // k = nums1.length;
    // }
    // }

    // j = nums1.length;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(nums1));
    // }

    // Still not working, but I think this is the right track
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Declare new array of size m + n
        int[] combinedArray = new int[m + n];

        int nums1Position = 0;
        int nums2Position = 0;
        int combinedArrayPosition = 0;

        while (true) {
            if (nums1[nums1Position] > nums2[nums2Position]) {
                combinedArray[combinedArrayPosition] = nums1[nums1Position];
                nums1Position++;
                combinedArrayPosition++;
                if (nums1Position == m) {
                    for (int i = nums2Position; nums2Position > n; i++) {
                        combinedArray[combinedArrayPosition] = nums2[i];
                        combinedArrayPosition++;
                    }
                    break;
                }
            } else {
                combinedArray[combinedArrayPosition] = nums2[nums2Position];
                nums2Position++;
                combinedArrayPosition++;
                if (nums2Position == n) {
                    for (int i = nums1Position; nums1Position > m; i++) {
                        combinedArray[combinedArrayPosition] = nums1[i];
                        combinedArrayPosition++;
                    }
                    break;
                }
            }
        }

        nums1 = combinedArray;
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
    }
}