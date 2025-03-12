class Solution {
    public boolean isSubsequence(String s, String t) {
        int currChar = 0;
        for (int i = 0; i < t.length(); i++) {
            if (currChar < s.length() && t.charAt(i) == s.charAt(currChar)) {
                currChar++;
            }
        }

        return currChar == s.length();
    }
}