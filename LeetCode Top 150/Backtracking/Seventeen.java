class Solution {
    public static List<String> letterBuilder(String[][] letters, int[] digits, int marker) {
        List<String> letterOptions = new ArrayList<>();
        if (marker + 1 >= digits.length) {
            for (int j = 0; j < letters[digits[marker] - 2].length; j++) {
                letterOptions.add(letters[digits[marker] - 2][j]);
            }
            // System.out.println(Arrays.toString(letterOptions.toArray()));
        } else {
            letterOptions = letterBuilder(letters, digits, marker + 1);
            List<String> newLetterOptions = new ArrayList<>();
            // System.out.println(String.valueOf(digits[marker]));
            // System.out.println(Arrays.toString(letterOptions.toArray()));
            for (int k = 0; k < letters[digits[marker] - 2].length; k++) {
                String currLetter = letters[digits[marker] - 2][k];
                // System.out.println(currLetter);
                for (int l = 0; l < letterOptions.size(); l++) {
                    newLetterOptions.add(currLetter + letterOptions.get(l));
                    System.out.println(currLetter + letterOptions.get(l));
                }
                // letterOptions.add(letters[marker][k]);
            }

            if (marker == 0) {
                return newLetterOptions;
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

        List<String> currentOptions = new ArrayList<>();

        if (digits.length() != 0) {
            currentOptions = letterBuilder(letters, currentDial, 0);
        }

        return currentOptions;
        
    }
}