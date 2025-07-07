class Solution {
    public List<String> generateMutations(String startGene, String[] genes, List<String> newOptions, int loc) {
        for (int f = 0; f < genes.length; f++) {
            newOptions.add(startGene.substring(0,loc) + genes[f] + startGene.substring(loc+1, startGene.length()));
        }
        
        if (loc+1 == startGene.length()) {
            return newOptions;
        } else {
            loc++;
            return generateMutations(startGene, genes, newOptions, loc);
        }
    }

    public int minMutation(String startGene, String endGene, String[] bank) {
        List<String> visited = new ArrayList<String>();
        List<String> currentLevel = Collections.singletonList(startGene);
        List<String> previousLevel = new ArrayList<String>();
        String[] genes = {"A", "C", "G", "T"};
        int level = 0;
        boolean next = true;

        while(next) {
            for (int k = 0; k < currentLevel.size(); k++) {
                if (currentLevel.get(k).equals(endGene)) return level;
                visited.add(currentLevel.get(k));
                // System.out.println(currentLevel.get(k));
            }
            
            level++;
            previousLevel = currentLevel;
            currentLevel = new ArrayList<String>();
            for (int i = 0; i < previousLevel.size(); i++) {
                List<String> newOptions = new ArrayList<String>();
                // newOptions.add(previousLevel.get(i));
                newOptions = generateMutations(previousLevel.get(i), genes, newOptions, 0);
                for (int m = 0; m < newOptions.size(); m++) {
                    // System.out.println(newOptions.get(m));
                    for (int n = 0; n < bank.length; n++) {
                        if (bank[n].equals(newOptions.get(m)) && !visited.contains(newOptions.get(m))) {
                            currentLevel.add(newOptions.get(m));
                        }
                    }
                }
            }

            if (currentLevel.size() == 0) {
                next = false;
            }
        }

        return -1;
    }
}