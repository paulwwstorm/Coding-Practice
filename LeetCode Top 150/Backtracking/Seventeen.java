import java.util.ArrayList;
import java.util.List;

public class Seventeen {
    // I understand it now...
    // famous last words
    // The concept is that the whole string should be passed in
    // The current number
    // When the final number is reached
    // It simply returns all letter options
    // The next level up takes this output
    // Adds all of its letter options
    // And passes them up
    // und so weiter
    public static List<String> letterBuilder(String[][] letters, int[] digits, int marker) {
        List<String> letterOptions = new ArrayList<>();
        if (marker + 1 == digits.length) {
            for (int j = 0; j < letters[marker].length; j++) {
                letterOptions.add(letters[marker][j]);
            }
        } else {
            List<String> currentOptions = letterBuilder(letters, digits, marker + 1);
            for (int k = 0; k < letters[marker].length; k++) {
                for (int l = 0; l < letterOptions.size(); l++) {
                    currentOptions.add(letters[marker][k]);
                }
                letterOptions.add(letters[marker][k]);
            }

            if (marker == 0) {
                return letterOptions;
            }
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
        {"w","x","y"}
        };

        int[] currentDial = new int[digits.length()];

        for (int i = 0; i < digits.length(); i++) {
            currentDial[i] = digits.charAt(i) - '0';
        }

        List<String> currentOptions = letterBuilder(letters, currentDial, 0);

        return currentOptions;
        
    }
}