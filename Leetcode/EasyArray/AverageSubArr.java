// 643. Maximum Average Subarray I

// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
// Example 2:

// Input: nums = [5], k = 1
// Output: 5.00000


package Leetcode.EasyArray;

public class AverageSubArr {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1: Compute sum of first k elements
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        double maxSum = windowSum;
        
        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        // Step 3: Return maximum average
        return maxSum / k;
    }
}

// Take the example:

// nums = [1, 12, -5, -6, 50, 3]
// k = 4

// n = 6

// Phase 1: Build the first window.

// We compute the sum of the first k elements.

// windowSum = 0

// i = 0 → windowSum = 0 + 1 = 1
// i = 1 → windowSum = 1 + 12 = 13
// i = 2 → windowSum = 13 + (-5) = 8
// i = 3 → windowSum = 8 + (-6) = 2

// Stop. First window is [1, 12, -5, -6]
// windowSum = 2

// We now set:

// maxSum = 2

// That’s our baseline.

// Now the real power move begins: sliding the window.

// The loop starts from i = k → i = 4
// We move one step to the right.

// Think physically. The window currently covers indices 0 to 3.
// We want it to cover 1 to 4.

// What changes?

// Element leaving: nums[i - k] = nums[4 - 4] = nums[0] = 1
// Element entering: nums[i] = nums[4] = 50

// So we update:

// windowSum = windowSum + entering - leaving
// windowSum = 2 + 50 - 1 = 51

// Now the window is [12, -5, -6, 50]
// Sum = 51

// Update maxSum:

// maxSum = max(2, 51) = 51

// Good. Keep sliding.

// Next iteration: i = 5

// Window currently covers 1 to 4.
// We want it to cover 2 to 5.

// Leaving: nums[5 - 4] = nums[1] = 12
// Entering: nums[5] = 3

// windowSum = 51 + 3 - 12 = 42

// Window is now [-5, -6, 50, 3]
// Sum = 42

// Update maxSum:

// maxSum = max(51, 42) = 51

// Loop ends.

// Final answer:

// maxSum / k = 51 / 4 = 12.75

// Done.

// Notice what we did NOT do:
// We never recomputed 4 elements again.
// We reused the previous work.

// This is the key mental model:

// A fixed window is just “previous sum + new element - old element.”

// If that pattern doesn’t instantly trigger in your brain during interviews, you need more reps.

// Brute force solution
//  public double findMaxAverage(int[] nums, int k) {
//         int n = nums.length;
//         double maxAvg = -Double.MAX_VALUE;
        
//         // Try every possible subarray of length k
//         for (int i = 0; i <= n - k; i++) {
//             double sum = 0;
            
//             // Compute sum of current window
//             for (int j = i; j < i + k; j++) {
//                 sum += nums[j];
//             }
            
//             double avg = sum / k;
//             maxAvg = Math.max(maxAvg, avg);
//         }
        
//         return maxAvg;
//     }