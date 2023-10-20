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
            if (entry.getValue() != magazineLetterCounts.get(entry.getValue())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
