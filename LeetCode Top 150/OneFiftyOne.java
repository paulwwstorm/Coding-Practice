public class OneFiftyOne {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String reversedString = "";

        for (int i = 0; i < s.length() / 2; i++) {
            String wordToReverse = words[i];
            reversedString = reversedString + words[words.length - (i + 1)] + " ";
        }

        substring
        return reversedString;
    }

    public static void main(String[] args) {
        System.out.println(5 / 2);
    }
}
