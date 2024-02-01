class Twenty {
class Solution {
class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        List<Character> openCharacters = new ArrayList<>(Arrays.asList("{".charAt(0), "[".charAt(0), "(".charAt(0)));

        for (int i = 0; i < s.length(); i++) {
            System.out.println(i);
            if (openCharacters.contains(s.charAt(i))) {
                charStack.push(s.charAt(i));
            } else if (
                charStack.size() != 0 &&
                (("]".charAt(0) == s.charAt(i) && charStack.peek().equals("[")) | 
                ("}".charAt(0) == s.charAt(i) && charStack.peek().equals("{")) | 
                (")".charAt(0) == s.charAt(i) && charStack.peek().equals("(")))) {
                    charStack.pop();
            } else {
                return false;
            }
        }

        if (charStack.size() > 0) {
            return false;
        }

        return true;
    }
}

    public static void main(String[] args) {
        System.out.println();
    }
}