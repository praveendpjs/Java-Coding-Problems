// https://leetcode.com/problems/contains-duplicate/description/

// 217. Contains Duplicate
// Attempted
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.

// Example 2:

// Input: nums = [1,2,3,4]

// Output: false

// Explanation:

// All elements are distinct.

// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]

// Output: true


// Brute force solution not good but I've got it on my first attempt 
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}

// Using hashset:
// public boolean containsDuplicate(int[] nums) {
//         Set<Integer> seen = new HashSet<>();
//         for (int num : nums) {
//             if (!seen.add(num)) {
//                 return true;
//             }
//         }
//         return false;
//     }

// without using hashset:
// public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return true;
//             }
//         }
//         return false;
//     }