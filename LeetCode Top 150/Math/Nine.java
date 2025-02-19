class Solution {
    public boolean isPalindrome(int x) {
        System.out.println(String.valueOf(x / ((int) Math.pow(10, length - 2))));
        System.out.println(String.valueOf(x % ((int) Math.pow(10, 2))));
        if (x > 9) {
            int length = (int) (Math.log10(x) + 1);
            
            for (int i = 1; i <= length/2; i++) {
                // System.out.println(String.valueOf(x / ((int) Math.pow(10, length - i))));\
                // System.out.println(String.valueOf(i));
                int first = x / ((int) Math.pow(10, length - i));
                // System.out.println(String.valueOf(x / ((int) Math.pow(10, length - 2))));
                int second = x % (int) Math.pow(10, i);
                // System.out.println(String.valueOf(x % (int) Math.pow(10, 2));
                if (first != second) {
                    return false;
                }
            }

            return true;
        } else if (x >= 0) {
            return true;
        }

        return false;  
    }
}