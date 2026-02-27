// https://leetcode.com/problems/3sum/?envType=problem-list-v2&envId=w04w6me5
// 15. 3Sum

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
package Leetcode.MediumArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            
            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    
                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        
        return result;
    }
}

// Let’s walk through this input step by step:

// nums = [-1, 0, 1, 2, -1, -4]

// First move: sort the array.

// After sorting:

// [-4, -1, -1, 0, 1, 2]

// Now we start the outer loop.

// i = 0
// nums[i] = -4

// We now look for two numbers that sum to 4 (because -4 + x + y = 0 → x + y = 4).

// left = 1 (−1)
// right = 5 (2)

// Sum = -4 + (-1) + 2 = -3
// Too small → move left.

// left = 2 (−1)
// Sum = -4 + (-1) + 2 = -3
// Still small → move left.

// left = 3 (0)
// Sum = -4 + 0 + 2 = -2
// Still small → move left.

// left = 4 (1)
// Sum = -4 + 1 + 2 = -1
// Still small → move left.

// left = 5
// Now left == right → stop.

// No triplet with -4. Move on.

// i = 1
// nums[i] = -1

// Now we look for two numbers that sum to 1.

// left = 2 (−1)
// right = 5 (2)

// Sum = -1 + (-1) + 2 = 0

// Boom. Triplet found: [-1, -1, 2]

// Now here’s where weak implementations fail: duplicates.

// We skip duplicate values for left and right before moving them.

// left moves from 2 to 3
// right moves from 5 to 4

// Now:

// left = 3 (0)
// right = 4 (1)

// Sum = -1 + 0 + 1 = 0

// Another hit: [-1, 0, 1]

// Skip duplicates again (none here).

// left = 4
// right = 3

// Stop inner loop.

// i = 2
// nums[i] = -1

// Now this is the trap.

// It’s the same value as nums[1].
// If we don’t skip this, we’ll produce duplicate triplets.

// So because nums[2] == nums[1], we continue and skip it.

// i = 3
// nums[i] = 0

// Now we look for two numbers that sum to 0.

// left = 4 (1)
// right = 5 (2)

// Sum = 0 + 1 + 2 = 3
// Too large → move right.

// right = 4
// Stop.

// Final answer:

// [[-1, -1, 2], [-1, 0, 1]]

// public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;

//         for (int i = 0; i < n - 2; i++) {
//             for (int j = i + 1; j < n - 1; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(triplet); // normalize order
//                         set.add(triplet);
//                     }
//                 }
//             }
//         }

//         return new ArrayList<>(set);
//     }