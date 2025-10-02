class Solution {
    public int reverseBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        String binaryStringReverse = "";
        int missing = 32 - binaryString.length();

        for (int j = 0; j < missing; j++) {
            binaryString = "0" + binaryString;
        }


        for (int i = 0; i < binaryString.length(); i++) {
            binaryStringReverse = binaryString.charAt(i) + binaryStringReverse;
        }


        int reverse = Integer.parseInt(binaryStringReverse, 2);
        return reverse;
    }
}