import java.util.ArrayList;
import java.util.List;

public class OneHundredNinetyNine {
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
    
    public List<Integer> treeRightSide(TreeNode node, List<Integer> rightSideVals, int maxDepth, int currentDepth) {
        if (node != null) {
            currentDepth += 1;
            if (currentDepth > maxDepth) {
                rightSideVals.add(node.val);
                maxDepth += 1;
            }
            rightSideVals = treeRightSide(node.right, rightSideVals, maxDepth, currentDepth);
            
            rightSideVals = treeRightSide(node.left, rightSideVals, madDepth, currentDepth);
        }
            
        return [rightSideVals, maxDepth];

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideVals = new ArrayList<Integer>();
        int depth = 0;
        return treeRightSide(root, rightSideVals, depth, depth);
    }
}