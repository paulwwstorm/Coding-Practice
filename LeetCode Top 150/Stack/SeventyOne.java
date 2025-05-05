class Solution {
    public String simplifyPath(String path) {
        List<String> directories = new ArrayList<String>();
        String currDirectory = new String();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/' && currDirectory.length() != 0) {
                directories.add(currDirectory);
                currDirectory = "";
            } else if (path.charAt(i) != '/') {
                currDirectory += path.charAt(i);
            }
        }

        if (currDirectory.length() != 0) directories.add(currDirectory);
        String formattedDirectory = new String();
        int skipped = 0;

        for (int j = directories.size()-1; j >= 0; j--) {
            if (directories.get(j).equals("..")) {
                skipped++;
            } else if (!directories.get(j).equals(".")) {
                if (skipped > 0) {
                    skipped--;    
                } else {
                    formattedDirectory = '/' + directories.get(j) + formattedDirectory;
                }
            }
        }

        return formattedDirectory.length() != 0 ? formattedDirectory : "/";
    }
}