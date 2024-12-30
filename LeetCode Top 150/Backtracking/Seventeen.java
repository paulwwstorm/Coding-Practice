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

    public static String[] letterBuilder(String[][] letters, int[] digits, int marker) {
    
        if (marker + 1 < digits.length) {
            String[] letterOptions;
            for (int j = 0; j < letters[marker].length; j++) {
                letterOptions[j] = letters[marker][j];
            }
        } else {
            String[] currentOptions = letterBuilder(letters, digits, marker + 1);
            String[currentOptions.length*letters[marker].length] letterOptions;
            for (int k = 0; k < letters[marker].length; k++) {
                for (int l = 0; l < letterOptions.length; l++) {
                    currentOptions[] = letters[marker][j];
                }
                letterOptions[k] = letters[marker][k];
            }
        }

        return String.valueOf(letters[digit][marker]) + letterCombo ;
    }

    // public void  List<String> letterCombinations(String digits) {

        
    // }

    public static void main(String[] args) {
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

        int[] currentDial = {2};

        String[] currentOptions = letterBuilder(letters, currentDial, 0);

        for (int i = 0; i < currentOptions.length; i++) {
            System.out.println(currentOptions[i]);
        }
    
    }
}