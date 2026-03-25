// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
// Kadane's Algorithm
// Difficulty: MediumAccuracy: 36.28%Submissions: 1.2MPoints: 4Average Time: 20m
// You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

// Note : A subarray is a continuous part of an array.

// Examples:

// Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output: 11
// Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
// Input: arr[] = [-2, -4]
// Output: -2
// Explanation: The subarray [-2] has the largest sum -2.
// Input: arr[] = [5, 4, 1, 7, 8]
// Output: 25
// Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
package GeeksForGeeks.ArrayMedium;

public class KadanesAlgorithm {
    public static int maxSubArray(int[] nums) {
        
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        System.out.println(maxSubArray(arr)); // 6
    }
}

// 1. The Problem Kadane's Algorithm Solves

// Problem:
// Find the maximum sum of a contiguous subarray in an array.

// Example:

// Input:
// [-2,1,-3,4,-1,2,1,-5,4]

// Output:
// 6

// Explanation:
// Subarray [4,-1,2,1] = 6 (maximum)
// 2. Brute Force Approach (Trash — But You Must Understand Why)

// First instinct most people have:

// Generate all subarrays
// Compute sum
// Track max

// Example:

// [-2,1,-3,4]

// Subarrays:

// [-2] = -2
// [-2,1] = -1
// [-2,1,-3] = -4
// [-2,1,-3,4] = 0
// [1] = 1
// [1,-3] = -2
// [1,-3,4] = 2
// [-3] = -3
// [-3,4] = 1
// [4] = 4

// Time Complexity:

// O(n^2) or O(n^3)

// Interviewers will reject this immediately.

// 3. The Core Insight (This Is Where Kadane Becomes Genius)

// Ask yourself:

// If the current sum becomes negative…
// Should we keep carrying it forward?

// Answer:

// No. Drop it. Start fresh.

// Because:

// Negative sum + next number = always worse

// Example:

// Current Sum = -5
// Next element = 4

// -5 + 4 = -1   (worse than just 4)

// So:

// Whenever sum becomes negative → reset to 0

// That's the entire idea.

// 4. Kadane's Algorithm Logic

// We track two variables:

// 1. currentSum

// Running sum of subarray

// 2. maxSum

// Maximum sum found so far

// 5. Step-By-Step Example

// Array:

// [-2,1,-3,4,-1,2,1,-5,4]
// Element	currentSum	maxSum
// -2	-2 → reset to 0	-2
// 1	1	1
// -3	-2 → reset 0	1
// 4	4	4
// -1	3	4
// 2	5	5
// 1	6	6
// -5	1	6
// 4	5	6

// Final Answer:

// 6

// 7. Why This Version Is Better

// This line is the heart:

// currentSum = Math.max(nums[i], currentSum + nums[i]);

// Meaning:

// Either:

// Start new subarray from current element
// OR continue previous subarray

// Pick whichever is better.


// Brute force solution
// public class KadaneBruteForce {

//     public static int maxSubArray(int[] arr) {
        
//         int maxSum = Integer.MIN_VALUE;

//         for(int i = 0; i < arr.length; i++) {
            
//             int currentSum = 0;

//             for(int j = i; j < arr.length; j++) {
                
//                 currentSum += arr[j];
                
//                 maxSum = Math.max(maxSum, currentSum);
//             }
//         }

//         return maxSum;
//     }

//     public static void main(String[] args) {
        
//         int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
//         System.out.println(maxSubArray(arr));
//     }
// }