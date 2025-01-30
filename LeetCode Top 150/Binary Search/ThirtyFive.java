class Solution {
    public int insertSearchHelper(int[] nums, int target, int leftPointer, int rightPointer) {
        int midPoint = (rightPointer-leftPointer)/2;
        int midValue = nums[]

        if (midPoint > 0) {

        } 
        if (nums.length > 1) {
            int midValue = nums[(nums.length/2) + 1];
            if (midValue == target) {
                return (nums.length/2) + 1;
            } else if (target < midValue) {
                int[] nextSearch = Arrays.copyOfRange(nums, 0, nums.length/2);
            } else if (target > midValue) {
                int nextSearch = Arrays.copyOfRange(nums,((nums.legnth/2) + 2), nums.length);
            }
        }
        


    //If only one element
    //And not target
    //If element larger
    //Insert index to left
    //Otherwise
    //Insert index to the left

    //I think this will work...
}

public int searchInsert(int[] nums, int target) {
    return insertSearchHelper(nums, target, 0, (nums.length -1));
}
