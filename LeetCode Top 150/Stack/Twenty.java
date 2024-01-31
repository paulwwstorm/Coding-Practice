class Twenty {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        List<Character> openCharacters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (openCharacters.contains(s.charAt(i))) {
                charStack.push(s.charAt(i));
            } else if (
                (s.charAt(i) == "]" & charStack.peek().equals("[")) | 
                (s.charAt(i) == "}" & charStack.peek().equals("{")) | 
                (s.charAt(i) == ")" & charStack.peek().equals("("))) {
                    stringStack.pop();
            } else {
                return false;
            }
        }

        if (charStack.size() > 0) {
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
    }
}