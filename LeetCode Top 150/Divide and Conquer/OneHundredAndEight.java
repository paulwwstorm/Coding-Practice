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
    public void divideAndContinue(int[] nums, TreeNode currNode) {
        if (nums.length > 1) {
            TreeNode nextNode = new TreeNode();
            nextNode.val = nums[nums.length/2];
            if (nextNode.val > currNode.val) {
                currNode.right = nextNode;
            } else {
                currNode.left = nextNode;
            }
            
            int[] firstHalf = Arrays.copyOfRange(nums, 0, (nums.length/2) - 1);
            int[] secondHalf =  Arrays.copyOfRange(nums, (nums.length/2) + 1, nums.length);

            divideAndContinue(firstHalf, nextNode);
            divideAndContinue(secondHalf, nextNode);
        } else if (nums.length > 0) {
            TreeNode leftNode = new TreeNode();
            leftNode.val = nums[0];
            // TreeNode rightNode = new TreeNode();
            // rightNode.val = nums[1];
        }


    }

    public TreeNode sortedArrayToBST(int[] nums) {
        System.out.println(String.valueOf(9/2));

        TreeNode root = new TreeNode();
    
        divideAndContinue(nums, root);

        return root;
    }
}