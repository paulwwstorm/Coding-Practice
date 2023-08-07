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

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Declare new array of size m + n
        int[] combinedArray = new int[m + n];
        
        for (int i = 0; i < m; i++) {
            for (int j = i; j < nums1.length; j++) {
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
    }
}