class Solution {
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z]", "");
        str.toLowerCase();

        System.out.println(str);

        int pointerOne = 0;
        int pointerTwo = str.length() - 1;

        while (pointerOne < pointerTwo) {
            if (s.charAt(pointerOne) != s.charAt(pointerTwo)) {
                return false;
            }
            pointerOne += 1;
            pointerTwo += 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";
        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));
        System.out.println(isPalindrome(input3));
    }
}