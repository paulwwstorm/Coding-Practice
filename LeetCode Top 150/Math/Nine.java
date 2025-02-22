class Solution {
    public boolean isPalindrome(int x) {
        if (x > 9) {
            int length = (int) (Math.log10(x) + 1);
            
            for (int i = 1; i <= length/2; i++) {
                int frontFirst = (x % (int) Math.pow(10, (length + 1) - i)) - (x % (int) Math.pow(10, length - i));
                int front = frontFirst / ((int) Math.pow(10, length - i));

                int backFirst = (x % (int) Math.pow(10, i)) - (x % (int) Math.pow(10, i - 1));
                int back = backFirst / ((int) Math.pow(10, i - 1));
                                         
                if (front != back) {
                    return false;
                }
            }

            return true;
        }

        return false;  
    }
}