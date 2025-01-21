/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode divideAndContinue(int[] nums, TreeNode prevNode) {
        TreeNode currNode = new TreeNode();

        if (nums.length > 1) {
            currNode.val = nums[nums.length/2];
 
            int[] firstHalf = Arrays.copyOfRange(nums, 0, nums.length/2);
            divideAndContinue(firstHalf, currNode);

            if (nums.length > 2) {
                int[] secondHalf =  Arrays.copyOfRange(nums, (nums.length/2) + 1, nums.length);
                divideAndContinue(secondHalf, currNode);
            }
            
        } else if (nums.length == 1) {
            currNode.val = nums[0];
        }

        if (prevNode != null) {
            if (prevNode.val < currNode.val) {
                prevNode.right = currNode;
            } else {
                prevNode.left = currNode;
            }
        }

        return currNode;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = divideAndContinue(nums, null);

        return root;
    }
}