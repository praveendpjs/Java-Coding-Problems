// https://leetcode.com/problems/longest-increasing-subsequence/description/
// 300. Longest Increasing Subsequence

// Given an integer array nums, return the length of the longest strictly increasing subsequence.

// Example 1:

// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
// Example 2:

// Input: nums = [0,1,0,3,2,3]
// Output: 4
// Example 3:

// Input: nums = [7,7,7,7,7,7,7]
// Output: 1

package Leetcode.MediumArray;

public class LongestIncSub {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        int max = 1;
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // each element alone
            
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
    
}
// 🔍 Example 1
// nums = [10, 9, 2, 5, 3, 7]

// We build dp[] step by step.

// 👉 i = 0 (10)
// No previous elements
// So:
// dp[0] = 1
// 👉 i = 1 (9)

// Check all j < 1:

// j = 0 → 10 < 9 ❌ (cannot extend)
// dp[1] = 1
// 👉 i = 2 (2)
// j = 0 → 10 < 2 ❌
// j = 1 → 9 < 2 ❌
// dp[2] = 1
// 👉 i = 3 (5)

// Now things get interesting.

// j = 0 → 10 < 5 ❌
// j = 1 → 9 < 5 ❌
// j = 2 → 2 < 5 ✅

// 👉 So:

// dp[3] = dp[2] + 1 = 2
// 👉 i = 4 (3)
// j = 0 → ❌
// j = 1 → ❌
// j = 2 → 2 < 3 ✅ → dp = 2
// j = 3 → 5 < 3 ❌
// dp[4] = 2
// 👉 i = 5 (7)

// Check all:

// j = 0 → ❌
// j = 1 → ❌
// j = 2 → 2 < 7 ✅ → dp = 2
// j = 3 → 5 < 7 ✅ → dp = 3
// j = 4 → 3 < 7 ✅ → dp = 3
// dp[5] = 3
// ✅ Final dp:
// [1, 1, 1, 2, 2, 3]

// Answer = max = 3
// This was my first instinct but it's wrong
// public int lengthOfLIS(int[] nums) {
//         int count = 1;
//         int maxCount = 1;
//         for(int i = 0; i < nums.length - 1; i++){
//             if(nums[i + 1] > nums[i]){
//                 count++;
//                 maxCount = Math.max(count,maxCount);
//             }
//         }
//         return maxCount;
//     }

// nums = [4,10,4,3,8,9]

// Output
// 4
// Expected
// 3