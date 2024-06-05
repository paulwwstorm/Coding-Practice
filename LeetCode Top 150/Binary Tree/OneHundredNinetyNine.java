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
    
    public List<Integer> treeRightSide(TreeNode node, List<Integer> rightSideVals) {
        if (node != null) {
            rightSideVals.add(node.val);
            return treeRightSide(node.right, rightSideVals);
        } else {
            return rightSideVals;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideVals = new ArrayList<Integer>();
        return treeRightSide(root, rightSideVals);
    }
}
