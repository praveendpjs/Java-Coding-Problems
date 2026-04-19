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
    
}
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