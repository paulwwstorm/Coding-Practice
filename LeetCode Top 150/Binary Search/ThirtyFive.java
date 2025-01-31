class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int midPoint = (rightPointer-leftPointer)/2;

        while (leftPointer < rightPointer) {
            midPoint = ((rightPointer-leftPointer)/2 + leftPointer);

            if (nums[midPoint] == target) {
                return midPoint;
            } else if (nums[midPoint] > target) {
                rightPointer = midPoint - 1;
            } else {
                leftPointer = midPoint + 1;
            }
        }

        if (nums[leftPointer] > target || nums[leftPointer] == target) {
            return leftPointer;
        } else {
            return leftPointer + 1;
        }
    }
}