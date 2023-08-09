import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] combinedArray = new int[m + n];

        int nums1Position = 0;
        int nums2Position = 0;
        int combinedArrayPosition = 0;
        boolean emptyArray = false;

        System.out.println(m);
        System.out.println(n);

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, (m + n));
            emptyArray = true;
        } else if (n == 0) {
            emptyArray = true;
        }

        while (!emptyArray) {
            if (nums1[nums1Position] < nums2[nums2Position]) {
                combinedArray[combinedArrayPosition] = nums1[nums1Position];
                nums1Position++;
                combinedArrayPosition++;
                if (nums1Position == m) {
                    for (int i = nums2Position; i < n; i++) {
                        combinedArray[combinedArrayPosition] = nums2[i];
                        combinedArrayPosition++;
                    }
                    emptyArray = true;
                    System.arraycopy(combinedArray, 0, nums1, 0, (m + n));
                }
            } else {
                combinedArray[combinedArrayPosition] = nums2[nums2Position];
                nums2Position++;
                combinedArrayPosition++;
                if (nums2Position == n) {
                    for (int i = nums1Position; i < m; i++) {
                        combinedArray[combinedArrayPosition] = nums1[i];
                        combinedArrayPosition++;
                    }
                    emptyArray = true;
                    System.arraycopy(combinedArray, 0, nums1, 0, (m + n));
                }
            }
        }

        System.out.println(Arrays.toString(combinedArray));
    }

    // public static void main(String[] args) {
    // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    // int[] nums2 = { 2, 5, 6 };
    // merge(nums1, 3, nums2, 3);
    // }
}