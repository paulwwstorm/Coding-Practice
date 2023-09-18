public class Fourteen {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";

        outerloop: for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    break outerloop;
                }
            }
            longestCommonPrefix = 
        }

        return longestCommonPrefix;
    }
}
