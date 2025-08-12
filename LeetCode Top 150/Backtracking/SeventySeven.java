class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> options = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            List<List<Integer>> temp  = new ArrayList<>();
            for (int j = 0; j < options.size(); j++) {
                List<Integer> next = new ArrayList<Integer>(options.get(j));
                if (next.size() > k) {
                    options.remove(j);
                } else {
                    next.add(i);
                    temp.add(next);
                } 
            }

            options.addAll(temp);

            List<Integer> curr = new ArrayList<>();
            curr.add(i);
            options.add(curr);
        }

        options.removeIf(o -> o.size() != k);

        return options;
    }
}