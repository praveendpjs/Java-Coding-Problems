// https://leetcode.com/problems/longest-harmonious-subsequence/description/?envType=problem-list-v2&envId=wafs0t6v
// 594. Longest Harmonious Subsequence

// We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

// Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

// Example 1:

// Input: nums = [1,3,2,2,5,2,3,7]

// Output: 5

// Explanation:

// The longest harmonious subsequence is [3,2,2,2,3].

// Example 2:

// Input: nums = [1,2,3,4]

// Output: 2

// Explanation:

// The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

// Example 3:

// Input: nums = [1,1,1,1]

// Output: 0

// Explanation:

// No harmonic subsequence exists.

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static int findLHS(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // Step 2: Check pairs x and x+1
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (freq.containsKey(key + 1)) {
                int length = value + freq.get(key + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 3, 2, 2, 5, 2, 3, 7 };
        System.out.println(findLHS(nums1)); // 5

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println(findLHS(nums2)); // 2

        int[] nums3 = { 1, 1, 1, 1 };
        System.out.println(findLHS(nums3)); // 0
    }
}
// Example 1
// nums = [1,3,2,2,5,2,3,7]
// First, count frequencies:

// 1 → 1 time
// 2 → 3 times
// 3 → 2 times
// 5 → 1 time
// 7 → 1 time
// Now check neighboring pairs:

// Pair (1,2):

// count = 1 + 3 = 4
// subsequence could be: [1,2,2,2]
// max-min = 2-1 = 1 ✔
// Pair (2,3):

// count = 3 + 2 = 5
// subsequence could be: [3,2,2,2,3]
// max-min = 3-2 = 1 ✔
// Pair (3,4):

// 4 doesn't exist ❌
// Pair (5,6):

// 6 doesn't exist ❌
// Pair (7,8):

// 8 doesn't exist ❌
// Maximum = 5

// Answer = 5