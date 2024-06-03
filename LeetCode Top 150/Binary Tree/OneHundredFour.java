public class OneHundredFour {
    
    // Definition for a binary tree node.
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

    public int traverseDepth(TreeNode node, int depth) {
        int deepest = depth;
        if (node != null) {
            deepest += 1;
            int depthLeft = traverseDepth(node.left, (depth + 1));
            int depthRight = traverseDepth(node.right, (depth + 1));
            if (depthLeft > deepest) {
                deepest = depthLeft;
            }
            if (depthRight > deepest) {
                deepest = depthRight;
            }
        }

        return deepest;
    }

    public int maxDepth(TreeNode root) {
        return traverseDepth(root, 0);
    }
}
