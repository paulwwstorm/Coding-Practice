class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> options = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < options.size(); j++) {
                List<Integer> next = options.get(j);
                next.add(i);
                options.add(next);
            }
            List<Integer> curr = new ArrayList<>();
            curr.add(i);
            options.add(curr);
        }

        for (int j = 0; j < options.size(); j++) {
            if (options.get(j).size() != k) {
                options.remove(j);
            }
        }

        return options;
    }
}