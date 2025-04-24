class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sCharMap = new HashMap<>();
        String sAsDigits = "";
        Map<Character, Integer> tCharMap = new HashMap<>();
        String tAsDigits = "";

        for (int i = 0; i < s.length(); i++) {
            if (sCharMap.get(s.charAt(i)) == null) {
                sCharMap.put(s.charAt(i), i);
            }
            sAsDigits = sAsDigits + "-" + sCharMap.get(s.charAt(i));

            if (tCharMap.get(t.charAt(i)) == null) {
                tCharMap.put(t.charAt(i), i);
            }
            tAsDigits = tAsDigits + "-" + tCharMap.get(t.charAt(i));
        }

        System.out.println(sAsDigits);
        System.out.println(tAsDigits);

        return sAsDigits.equals(tAsDigits);
    }
}