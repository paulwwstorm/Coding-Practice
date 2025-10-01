class Solution {
    public int reverseBits(int n) {
        // This is not how to convert to bits...
        String binaryString = Integer.toBinaryString(n);
        String binaryStringReverse = "";

        for (int i = 0; i < binaryString.length(); i++) {
            binaryStringReverse = binaryString.charAt(i) + binaryStringReverse;
        }

        System.out.println(binaryStringReverse);

        int reverse = Integer.parseInt(binaryStringReverse, 2);
        return reverse;
    }
}