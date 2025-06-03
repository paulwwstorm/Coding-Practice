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
    public int[] nextNode(TreeNode node, int target, int[] result) {
        if (node == null || target < result[0]) {
            return result;
        }

        if (node.left == null) {
            result[0] = result[0] + 1;
        } else {
            result = nextNode(node.left, target, result);
            result[0] = result[0] + 1;
        }

        if (target == result[0]) {
            result[1] = node.val;
        } else {
            result = nextNode(node.right, target, result);
        }

        return result;
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] result = {0, Integer.MIN_VALUE};
        result = nextNode(root, k, result);
        
        return result[1];
    }
}