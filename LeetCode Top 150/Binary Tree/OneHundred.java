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
            if (p.left != null && q.left == null) {
                sameNode = false;
            } else if (p.left == null && q.left != null) {
                sameNode = false;
            } else if (p.left != null && p.left != null) {
                sameNode = isSameNode(p.left, q.left);
            }
        }

        if (sameNode) {
            if (p.right != null && q.right == null) {
                sameNode = false;
            } else if (p.right == null && q.right != null) {
                sameNode = false;
            } else if (p.right != null && p.right != null) {
                sameNode = isSameNode(p.right, q.right);
            }
        }

        return sameNode;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return isSameNode(p, q);
    }
}