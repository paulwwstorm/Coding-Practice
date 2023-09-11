class FortyTwo {
    public static int trap(int[] height) {
        return 0;
    }

    public static void main(String[] args) {
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height1));
        System.out.println("Expected: 6");
        System.out.println(trap(height2));
        System.out.println("Expected: 9");
    }
}