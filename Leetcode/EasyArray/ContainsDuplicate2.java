// https://leetcode.com/problems/contains-duplicate-ii/description/
// 219. Contains Duplicate II

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.


// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            
            window.add(nums[i]);
            
            // Maintain window size of at most k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}

// Solution is correct and I got it in my first attempt but time limit exceeded so not able to submit
// public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i = 0; i < nums.length; i++){
//             for(int j = 0; j < i; j++){
//                 if(nums[i] == nums[j] && Math.abs(i - j) <= k){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }