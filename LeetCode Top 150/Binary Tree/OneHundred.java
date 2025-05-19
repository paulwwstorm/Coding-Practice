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
    public boolean isSameNode(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null && q != null) || (p != null && q == null)) return false;
        boolean sameNode = p.val == q.val;
        if (sameNode) {
            sameNode = isSameNode(p.left, q.left);
        }

        if (sameNode) {
            sameNode = isSameNode(p.right, q.right);
        }

        return sameNode;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return isSameNode(p, q);
    }
}