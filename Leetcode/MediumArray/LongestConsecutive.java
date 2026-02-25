// https://leetcode.com/problems/longest-consecutive-sequence/description/
// 128. Longest Consecutive Sequence

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3

// Was asked in today's SLA L1 test almost got it right

package Leetcode.MediumArray;

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int max = 1;
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] == arr[i]) {
                // duplicate, ignore
                continue;
            }

            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        max = Math.max(max, count);

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // 4
    }
}
