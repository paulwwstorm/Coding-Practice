class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> currSubstring = new ArrayList<Character>();
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            if (currSubstring.indexOf(s.charAt(i)) >= 0) {
                if (currSubstring.size() > longest) {
                    longest = currSubstring.size();
                }

                currSubstring = new ArrayList<Character>();
                currSubstring.add(s.charAt(i));
            } else {
                currSubstring.add(s.charAt(i));
            }
        }

        return longest;
    }
}