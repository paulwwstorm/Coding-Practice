class Twenty {
class Solution {
class Solution {
    class Solution {
    class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        System.out.println(s);

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if ("(".charAt(0) == s.charAt(i) | "[".charAt(0) == s.charAt(i) | "{".charAt(0) == s.charAt(i)) {
                charStack.push(s.charAt(i));
            }
            else if (charStack.size() > 0) {
                if (
                    ("]".charAt(0) == s.charAt(i) && charStack.peek().equals("[".charAt(0))) | 
                    ("}".charAt(0) == s.charAt(i) && charStack.peek().equals("{".charAt(0))) | 
                    (")".charAt(0) == s.charAt(i) && charStack.peek().equals("(".charAt(0)))
                    ) {
                        charStack.pop();
                    }
                else {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (charStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

}

    public static void main(String[] args) {
        System.out.println();
    }
}