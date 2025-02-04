class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int findKthLargest(int[] nums, int k) {
        TreeNode root;
        TreeNode currNode = root;
        TreeNode prevNode; 
        int pointer = 0;

        while (nums.length > 0) {
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length, i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            for (int j = 0; j < nums.length, j++) {
                if (nums[j] == max) {
                    prevNode = currNode
                    currNode = 
                    TreeNode newNode;
                    currNode.val = nums[j];
                    nums = ArrayUtils.removeElement(num, nums[j]);
                    j = nums.length + 1;
                }
            }
        }
        
    }
}