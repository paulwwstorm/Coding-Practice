public class OneFiftyOne {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            if (words[words.length - (i + 1)] != "") {
                System.out.println("*" + words[words.length - (i + 1)].strip() + "*");
                reversedString = reversedString + words[words.length - (i + 1)].strip() + " ";
            }
        }

        reversedString = reversedString.strip();
        return reversedString;
    }

    public static void main(String[] args) {
        String input1 = "the sky is blue";
        String input2 = "  hello world  ";
        String input3 = "a good   example";
        System.out.println(reverseWords(input1));
        System.out.println(reverseWords(input2));
        System.out.println(reverseWords(input3));
    }
}
