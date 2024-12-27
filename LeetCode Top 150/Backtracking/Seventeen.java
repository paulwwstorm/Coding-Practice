class Solution {
    public Sttring letterBuilder(char[] letters, int digit, int marker) {
        System.out.println(letters[digit][marker]);
    
        if (marker + 1 < letters[digit].length) {
            String letterCombo = letterBuilder(letters, digit, (marker + 1));
        }

        return String.valueOf(letters[digit][marker]) + letterCombo ;
    }

    public List<String> letterCombinations(String digits) {
        char[] letters = {
            ["a","b","c"],
            ["d","e","f"],
            ["g","h","i"],
            ["j","k","l"],
            ["m","n","o"],
            ["p","q","r","s"],
            ["t","u","v"],
            ["w","x","y"]
            };

        
        
    }
}