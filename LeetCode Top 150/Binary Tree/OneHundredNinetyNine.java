import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public Map.Entry<Integer, List<Integer>> treeRightSide(Map.Entry<Integer, List<Integer>> treeSide, TreeNode node, int currentDepth) {

        if (node != null) {
            currentDepth += 1;
            if (currentDepth > treeSide.getKey()) {
                List<Integer> updatedTreeSide = treeSide.getValue();
                updatedTreeSide.add(node.val);
                treeSide = Map.entry(treeSide.getKey() + 1, updatedTreeSide);
            }
            treeSide = treeRightSide(treeSide, node.right, currentDepth);
            treeSide = treeRightSide(treeSide, node.left, currentDepth);
        }

        return treeSide;

    }


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideVals = new ArrayList<Integer>();
        int depth = 0;

        Map.Entry<Integer, List<Integer>> treeSide = Map.entry(depth, rightSideVals);
        return treeRightSide(treeSide, root, depth).getValue();
    }
}