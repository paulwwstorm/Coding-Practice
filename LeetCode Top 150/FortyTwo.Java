class FortyTwo {
    public static int trap(int[] height) {
        // So basically there are three key sections we need to break down
        // We need to find the two highest points
        // Empty space betwen the two highest points can be directly added to the total
        // Then we need to go the space between the highest points and the beginning and end
        // Looking for depressions that can be filled

        // Or perhaps I should just find the highest point?

        // int highest = 0;
        int highestIndex = 0;
        int waterTotal = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > height[highestIndex]) {
                highestIndex = i;
            }
        }

        int currentLeftPeak = 0;
        for (int j = 0; j < highestIndex; j++) {
            if (height[j] >= height[currentLeftPeak]) {
                currentLeftPeak = j;
            } else {
                waterTotal += height[currentLeftPeak] - height[j]; 
            }
        }

        for (int k = (height.length - 1); k > highestIndex; j--) {
            if (height[j] >= height[currentLeftPeak]) {
                currentLeftPeak = j;
            } else {
                waterTotal += height[currentLeftPeak] - height[j]; 
            }
        }

        return waterTotal;
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