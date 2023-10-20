import java.util.HashMap;

public class ThreeHundredEigthyThree {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> noteLetterCounts = new HashMap<>();
        HashMap<Character, Integer> magazineLetterCounts = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if (noteLetterCounts.containsKey(ransomNote.charAt(i))) {
                noteLetterCounts.put(ransomNote.charAt(i), (noteLetterCounts.get(ransomNote.charAt(i)) + 1));
            } else {
                noteLetterCounts.put(ransomNote.charAt(i), 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (magazineLetterCounts.containsKey(magazine.charAt(i))) {
                magazineLetterCounts.put(magazine.charAt(i), (magazineLetterCounts.get(magazine.charAt(i)) + 1));
            } else {
                magazineLetterCounts.put(magazine.charAt(i), 1);
            }
        }

        for (var entry : noteLetterCounts.entrySet()) {
            if (magazineLetterCounts.get(entry.getKey()) == null) {
                return false;
            } else if (entry.getValue() > magazineLetterCounts.get(entry.getKey())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        String ransomNote4 = "bgz";
        String magazine4 = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";

        // System.out.println(canConstruct(ransomNote1, magazine1));
        // System.out.println(canConstruct(ransomNote2, magazine2));
        // System.out.println(canConstruct(ransomNote3, magazine3));
        System.out.println(canConstruct(ransomNote4, magazine4));
    }
}
