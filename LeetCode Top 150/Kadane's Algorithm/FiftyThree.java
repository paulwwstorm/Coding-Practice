public class FiftyThree {
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = nums[0];
            int curr = 0;
            boolean allNeg = true;
    
            for (int i = 0; i < nums.length; i++) {
                if (allNeg == true && nums[i] >= 0) {
                    allNeg = false;
                }
    
                if (nums[i] < 0 && nums[i] > max) {
                    max = nums[i];
                } else {
                    if (curr + nums[i] > 0) {
                        if (curr > max) {
                            max = curr;
                        }
                        curr += nums[i];
                    } else if (curr + nums[i] <= 0) {
                        if (curr > max && allNeg == false) {
                            max = curr;
                        }
    
                        curr = 0;
                    }
    
                    if (curr > max && allNeg == false) {
                        max = curr;
                    }
                }
    
                System.out.println(String.valueOf(curr));
            }
    
            return max;
        }
    }
}
