class Twenty {
class Solution {
class Solution {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> charStack = new Stack<>();

            if (s.length() % 2 != 0) {
                return false;
            }

            for (int i = 0; i < s.length(); i++) {
                if ("]".charAt(0) == s.charAt(i) | "]".charAt(0) == s.charAt(i) | "]".charAt(0) == s.charAt(i)) {
                    charStack.push(s.charAt(i));
                }
                else {

                }
            }

            for (int j = s.length()/2; j < s.length(); j++) {
                System.out.println(s.charAt(j));
                System.out.println(")".charAt(0) == s.charAt(j));
                System.out.println(charStack.peek());
                System.out.println(charStack.peek().equals("(".charAt(0)));
                
                if (
                    ("]".charAt(0) == s.charAt(j) && charStack.peek().equals("[".charAt(0))) | 
                    ("}".charAt(0) == s.charAt(j) && charStack.peek().equals("{".charAt(0))) | 
                    (")".charAt(0) == s.charAt(j) && charStack.peek().equals("(".charAt(0)))
                    ) {
                        System.out.println("true");
                        charStack.pop();
                    }
                else {
                    System.out.println("false");
                    return false;
                }
            }

            return true;
        }
    }
}

    public static void main(String[] args) {
        System.out.println();
    }
}