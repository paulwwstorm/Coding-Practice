class Solution {
    public int[] increment(int[] digits, int loc) {
        if (digits[loc] < 9) {
            digits[loc] += 1;
        } else if (loc > 0) {
            digits[loc] = 0;
            loc--;
            digits = increment(digits, loc);
        } else {
            int[] expandedDigits = new int[digits.length + 1];
            expandedDigits[0] = 1;
            expandedDigits[1] = 0;
            for (int i = 1; i < digits.length; i++) {
                expandedDigits[i+1] = digits[i];
            }

            digits = expandedDigits;
        }

        return digits;
    }
    public int[] plusOne(int[] digits) {
        digits = increment(digits, digits.length-1);
        return digits;
    }
}