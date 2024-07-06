import java.util.ArrayList;

class Solution {
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

    public ArrayList<Integer> traverseDepth(TreeNode node, ArrayList<Integer> values) {
        if (node != null) {
            values.add(node.val);
            values = traverseDepth(node.left, values);
            values = traverseDepth(node.right, values);
        }

        return values;
    }

    public int ListMinDifference(ArrayList<Integer> values) {
        int minDiff = Math.abs(values.get(0) - values.get(1));

        for (int i = 0; i < values.size() - 1; i++) {
            if (Math.abs(values.get(i) - values.get(i + 1)) < minDiff) {
                minDiff = Math.abs(values.get(i) - values.get(i + 1));
            } 
        }

        return minDiff;
    }

    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        values = traverseDepth(root, values);
        values.sort(null);

        return ListMinDifference(values);
    }
}