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

    public void traverseDepth(TreeNode node, int depth) {
        if (node != null) {
            traverseDepth(node.left, (depth + 1));
            traverseDepth(node.right, (depth + 1));
            System.out.println(" " + String.valueOf(node.val) + " " + String.valueOf(depth));
        }
    }

    public int maxDepth(TreeNode root) {
        traverseDepth(root, 0);
        return 1;
    }
}
