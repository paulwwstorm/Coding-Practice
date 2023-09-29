public class Fourteen {
    public static String longestCommonPrefix(String[] strs) {
        int longestCommonPrefixEnd = 0;

        outerloop: for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i) || i >= strs[j].length()) {
                    break outerloop;
                }
            }
            longestCommonPrefixEnd++;
        }

        return strs[0].substring(0, longestCommonPrefixEnd);
    }

    public static void main(String[] args) {
        String[] strs1 = { "flower", "flow", "flight" };
        String[] strs2 = { "dog", "racecar", "car" };

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
    }
}
