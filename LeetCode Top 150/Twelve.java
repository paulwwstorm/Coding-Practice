public class Twelve {
    public static String intToRoman(int num) {
        // I 1
        // V 5
        // X 10
        // L 50
        // C 100
        // D 500
        // M 1000
        // So I think what we what to do is divide the number given
        // into each letter category
        // then we simply need to check if it needs to be represeted
        // using the "minus structure" as in 4 = IV
        String solution = "";

        if (num > 999) {
            int thousands = num / 1000;
            for (int i = 0; i < thousands; i++) {
                solution = "M" + solution;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int 
        System.out.println(39 / 10);
    }
}
