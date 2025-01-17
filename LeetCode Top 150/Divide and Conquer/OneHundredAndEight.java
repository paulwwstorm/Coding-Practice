public class OneHundredAndEight {
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

    // I have an idea of how to tackle this one
    // Take the middle value and add it to the tree
    // Then dived the array in half
    // Call again on the left side
    // Take the middle value of the left half of the tree
    // Divide it in half
    // Repeat until no more values left
    // Then go up and do the right side
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            
        }
    }
}
