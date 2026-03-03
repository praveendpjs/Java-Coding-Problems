// https://leetcode.com/problems/3sum-closest/description/?envType=problem-list-v2&envId=w04w6me5
// 16. 3Sum Closest

// Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
package Leetcode.MediumArray;

import java.util.Arrays;

public class Sum3Closest{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // Update closest sum if this is better
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // Exact match
                    return currentSum;
                }
            }
        }
        
        return closestSum;
    }
}

// Example:
// nums = [-1, 2, 1, -4]
// target = 1

// First rule: if you don’t sort, you’re gambling.

// After sorting:

// [-4, -1, 1, 2]

// Now we initialize:

// closestSum = sum of first 3 numbers
// = -4 + -1 + 1
// = -4

// Distance from target = | -4 - 1 | = 5

// This is just a starting baseline. Nothing magical.

// Now we start the outer loop.

// i = 0 → nums[i] = -4

// We now use two pointers:

// left = 1 → -1
// right = 3 → 2

// So we’re evaluating:

// -4 + (-1) + 2 = -3

// Distance from target = | -3 - 1 | = 4

// Better than 5.
// So update:

// closestSum = -3

// Now compare sum with target.

// -3 < 1

// Too small.
// Important mental model: since array is sorted, moving left pointer right increases the sum.

// So we do:

// left++ → left = 2 → value = 1

// Now evaluate again:

// -4 + 1 + 2 = -1

// Distance = | -1 - 1 | = 2

// Better again.
// Update:

// closestSum = -1

// Still -1 < 1
// Still too small.
// Move left again.

// left++ → left = 3

// Now left == right → stop inner loop.

// We exhausted all pairs that start with -4.

// Notice what happened:
// We systematically increased the sum because we knew it was too small.

// No guessing. Controlled movement.

// Now outer loop continues.

// i = 1 → nums[i] = -1

// Reset pointers:

// left = 2 → 1
// right = 3 → 2

// Compute:

// -1 + 1 + 2 = 2

// Distance = | 2 - 1 | = 1

// Better than previous closest (distance was 2).
// So:

// closestSum = 2

// Now compare:

// 2 > 1

// Too large.
// Since array is sorted, decreasing right pointer reduces sum.

// So:

// right-- → right = 2

// Now left == right → stop inner loop.

// Next outer iteration:

// i = 2

// We stop because we need at least 3 elements and i must go to n-3.

// We’re done.

// Final answer: 2