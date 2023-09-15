public class FiftyEight {
    public static int lengthOfLastWord(String s) {
        String[] splitString = s.split(" ");
        String lastWord = splitString[splitString.length - 1];
        int lastWordLength = lastWord.length();
        return lastWordLength;
    }

    public static void main(String[] args) {
        String test1 = "Only";
        String test2 = "Only two words";
        String test3 = "I mean put-together this shouldn't be $ a problem";
        System.out.println(lengthOfLastWord(test1));
        System.out.println(lengthOfLastWord(test2));
        System.out.println(lengthOfLastWord(test3));
    }
}