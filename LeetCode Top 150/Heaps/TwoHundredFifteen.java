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

    public int findKthLargest(int[] nums, int k) {
        int[] heap = new int[k];
        Arrays.fill(heap, Integer.MIN_VALUE);

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > heap[0]) {
                int pos = 0;
                pos = searchInsert(heap, nums[j]) - 1;

                for (int m = 0; m < pos; m++) {
                    heap[m] = heap[m + 1];
                }

                heap[pos] = nums[j];
            }
        }
        
        return heap[0];
    }
}