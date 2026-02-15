// https://leetcode.com/problems/single-number/description/
// 136. Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

// Example 2:

// Input: nums = [4,1,2,1,2]

// Output: 4

// Example 3:

// Input: nums = [1]

// Output: 1
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num:nums){
            result ^= num;
        }
        return result; 
    }
    public static void main(String[] args) {
        
    }
}

// Key properties of XOR (^):

// a ^ a = 0 (a number cancels itself)

// a ^ 0 = a

// XOR is commutative and associative (order doesn’t matter)
// Example 1

// Array: [2, 3, 5, 4, 5, 3, 4]

// We XOR everything:

// result = 0

// result ^= 2   → 0 ^ 2 = 2
// result ^= 3   → 2 ^ 3 = 1
// result ^= 5   → 1 ^ 5 = 4
// result ^= 4   → 4 ^ 4 = 0
// result ^= 5   → 0 ^ 5 = 5
// result ^= 3   → 5 ^ 3 = 6
// result ^= 4   → 6 ^ 4 = 2


// Final answer: 2

// Now see the smarter view (the one interviewers want):

// 2 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4
// = 2 ^ (3 ^ 3) ^ (5 ^ 5) ^ (4 ^ 4)
// = 2 ^ 0 ^ 0 ^ 0
// = 2