class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sCharMap = new HashMap<>();
        Map<Character, Integer> tCharMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sCharMap.get(s.charAt(i)) == null) {
                sCharMap.put(s.charAt(i), i);
            }

            if (tCharMap.get(t.charAt(i)) == null) {
                tCharMap.put(t.charAt(i), i);
            }

            if (tCharMap.get(t.charAt(i)) != sCharMap.get(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}