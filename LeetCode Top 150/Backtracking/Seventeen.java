import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> letterBuilder(String[][] letters, int[] digits, int marker) {
        List<String> letterOptions = new ArrayList<>();
        if (marker + 1 == digits.length) {
            for (int j = 0; j < letters[digits[marker] - 2].length; j++) {
                letterOptions.add(letters[digits[marker] - 2][j]);
            }
        } else if (marker + 1 < digits.length) {
            letterOptions = letterBuilder(letters, digits, marker + 1);
            List<String> newLetterOptions = new ArrayList<>();
            for (int k = 0; k < letters[digits[marker] - 2].length; k++) {
                String currLetter = letters[digits[marker] - 2][k];
                for (int l = 0; l < letterOptions.size(); l++) {
                    newLetterOptions.add(currLetter + letterOptions.get(l));
                    System.out.println(currLetter + letterOptions.get(l));
                }
            }

            
            return newLetterOptions;

        }

        return letterOptions;
    }

    public List<String> letterCombinations(String digits) {
        String[][] letters = {
        {"a","b","c"},
        {"d","e","f"},
        {"g","h","i"},
        {"j","k","l"},
        {"m","n","o"},
        {"p","q","r","s"},
        {"t","u","v"},
        {"w","x","y","z"}
        };

        int[] currentDial = new int[digits.length()];

        for (int i = 0; i < digits.length(); i++) {
            currentDial[i] = digits.charAt(i) - '0';
        }

        return letterBuilder(letters, currentDial, 0);;
        
    }
}