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
                }
    
            return max;
        }
    }
}

// Rewritten using a top answer from LeetCode
// I think one of the big mistakes I made
// Was thinking that negative numbers needed to be handled separately
// I'd like to think the underlying logic is the same
// I guess the issue I ran into was that I was resetting
// curr = 0
// And then because of that curr was greater than max
// When all numbers are negative
// The correct method is to be sure to add 
// The current value to the sum before comparing to max

// public int maxSubArray(int[] nums) {
//     int max = Integer.MIN_VALUE;
//     int curr = 0;

//     for (int i = 0; i < nums.length; i++) {

//         curr += nums[i];
//         if (curr > max) {
//             max = curr;
//         }

//         if (curr < 0) {
//             curr = 0;
//         }

//     }

//     return max;
// }
