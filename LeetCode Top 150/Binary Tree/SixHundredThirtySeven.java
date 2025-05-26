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
    public void handleNode(TreeNode node, int level, ArrayList<ArrayList<Integer>> values) {
        if (node == null) return;
        if (values.size() == level) {
            ArrayList<Integer> newLevel = new ArrayList<Integer>();
            values.add(newLevel);
        }
        values.get(level).add(node.val);
        level++;
        handleNode(node.left, level, values);
        handleNode(node.right, level, values);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<ArrayList<Integer>> values = new ArrayList<ArrayList<Integer>>();
        handleNode(root, 0, values);

        List<Double> averages = new ArrayList<>();

        for (int i = 0; i < values.size(); i++) {
            double total = 0;
            double count = 0;
            for (int j = 0; j < values.get(i).size(); j++) {
                total += values.get(i).get(j);
                count++;
            }
            averages.add(total/count);
        }

        return averages;
    }
}