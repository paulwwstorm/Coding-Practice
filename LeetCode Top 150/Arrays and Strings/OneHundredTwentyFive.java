class Solution {
    public static boolean isPalindrome(String s) {
        String formattedStr = s.replaceAll("[^a-zA-Z0-9]", "");
        formattedStr = formattedStr.toLowerCase();

        int pointerOne = 0;
        int pointerTwo = formattedStr.length() - 1;

        while (pointerOne < pointerTwo) {
            if (formattedStr.charAt(pointerOne) != formattedStr.charAt(pointerTwo)) {
                return false;
            }
            pointerOne += 1;
            pointerTwo -= 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";
        String input4 = "0P";
        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));
        System.out.println(isPalindrome(input3));
        System.out.println(isPalindrome(input4));
    }
}