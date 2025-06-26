class Solution {
    public List<String> generateMutations(String startGene, String endGene, List<String> newOptions, String[] bank, List<String> visited, int loc) {
        loc++;

        if (startGene.charAt(loc) != endGene.charAt(loc)) {
            for (int j = 0; j < newOptions.size(); j++) {
                String mutation = startGene.substring(0,loc) + endGene.charAt(loc) + startGene.substring(loc+1, startGene.length());
                for (int l = 0; l < bank.length; l++) {
                    if (bank[l] == mutation) {
                        if (!visited.contains(mutation)) {
                            newOptions.add(mutation);
                        }
                    }
                }
            }
        }
        
        if (loc+1 == startGene.length()) {
            return newOptions;
        } else {
            return generateMutations(startGene, endGene, newOptions, bank, visited, loc);
        }
    }

    public int minMutation(String startGene, String endGene, String[] bank) {
        List<String> visited = new ArrayList<String>();
        List<String> currentLevel = Collections.singletonList(startGene);
        List<String> previousLevel = new ArrayList<String>();
        int level = 0;
        boolean next = true;

        while(next) {
            for (int k = 0; k < currentLevel.size(); k++) {
                if (currentLevel.get(k) == endGene) return level;
                visited.add(currentLevel.get(k));
            }
            
            level++;
            previousLevel = currentLevel;
            currentLevel = new ArrayList<String>();
            for (int i = 0; i < previousLevel.size(); i++) {
                List<String> newOptions = new ArrayList<String>();
                newOptions = generateMutations(previousLevel.get(i), endGene, newOptions, bank, visited, 0);
                currentLevel.addAll(newOptions);
            }

            if (currentLevel.size() == 0) {
                next = false;
            }
        }

        return -1;
    }
}