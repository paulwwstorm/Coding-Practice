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

        int thousands = num / 1000;
        num = num - (1000 * thousands);
        for (int i = 0; i < thousands; i++) {
            solution = "M" + solution;
        }

        int hundreds = num / 100;
        num = num - (100 * hundreds);
        if (hundreds == 9) {
            hundreds -= 9;
            solution = solution + "CM";
        } else if (hundreds == 4) {
            hundreds -= 4;
            solution = solution + "CD";
        } else if (hundreds >= 5) {
            hundreds -= 5;
            solution = solution + "D";
        }
        for (int i = 0; i < hundreds; i++) {
            solution = solution + "C";
        }

        int tens = num / 10;
        num = num - (10 * tens);
        if (tens == 9) {
            tens -= 9;
            solution = solution + "XC";
        } else if (tens == 4) {
            tens -= 4;
            solution = solution + "XL";
        } else if (tens >= 5) {
            tens -= 5;
            solution = solution + "L";
        }
        for (int i = 0; i < tens; i++) {
            solution = solution + "X";
        }

        int ones = num;
        if (ones == 9) {
            ones -= 9;
            solution = solution + "IX";
        } else if (ones == 4) {
            ones -= 4;
            solution = solution + "IV";
        } else if (ones >= 5) {
            ones -= 5;
            solution = solution + "V";
        }
        for (int i = 0; i < ones; i++) {
            solution = solution + "I";
        }

        return solution;
    }

    public static void main(String[] args) {
        int num1 = 3999;
        int num2 = 246;
        int num3 = 1089;
        System.out.println(intToRoman(num1));
        System.out.println(intToRoman(num2));
        System.out.println(intToRoman(num3));
    }
}
