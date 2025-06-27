class Solution {
    public List<String> generateMutations(String startGene, String endGene, List<String> newOptions, String[] bank, List<String> visited, int loc) {
        if (startGene.charAt(loc) != endGene.charAt(loc)) {
            System.out.println("Diff found");
            int end = newOptions.size();
            for (int j = 0; j < end; j++) {
                String mutation = newOptions.get(j).substring(0,loc) + endGene.charAt(loc) + newOptions.get(j).substring(loc+1, startGene.length());
                newOptions.add(mutation);
            }
        }
        
        if (loc+1 == startGene.length()) {
            return newOptions;
        } else {
            loc++;
            return generateMutations(startGene, endGene, newOptions, bank, visited, loc);
        }
    }

    public int minMutation(String startGene, String endGene, String[] bank) {
        List<String> visited = new ArrayList<String>();
        List<String> currentLevel = Collections.singletonList(startGene);
        List<String> previousLevel = new ArrayList<String>();
        int mutationCount = 0;
        boolean next = true;

        while(next) {
            for (int k = 0; k < currentLevel.size(); k++) {
                if (currentLevel.get(k).equals(endGene)) return level;
                visited.add(currentLevel.get(k));
                System.out.println(currentLevel.get(k));
            }
            
            level++;
            previousLevel = currentLevel;
            currentLevel = new ArrayList<String>();
            for (int i = 0; i < previousLevel.size(); i++) {
                List<String> newOptions = new ArrayList<String>();
                newOptions.add(previousLevel.get(i));
                newOptions = generateMutations(previousLevel.get(i), endGene, newOptions, bank, visited, 0);
                for (int m = 0; m < newOptions.size(); m++) {
                    System.out.println(newOptions.get(m));
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