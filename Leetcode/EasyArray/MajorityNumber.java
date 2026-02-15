// https://leetcode.com/problems/majority-element/description/
// 169. Majority Element

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

import java.util.HashMap;
import java.util.Map;

public class MajorityNumber {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int threshold = nums.length / 2;

        for (int num : nums) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            if (count > threshold) {
                return num;
            }
        }

        return -1; // guaranteed not to happen
    }
    public static void main(String[] args) {
        
    }
}

// Boyer–Moore does not find “the most frequent element.” It finds the element that would win if every different pair fought and eliminated each other. Only a true > n/2 majority is mathematically guaranteed to survive that war.

// public int majorityElement(int[] nums) {
//         int candidate = 0;
//         int count = 0;

//         for (int num : nums) {
//             if (count == 0) {
//                 candidate = num;   // pick a new candidate
//             }

//             if (num == candidate) {
//                 count = count + 1; // same number supports the candidate
//             } else {
//                 count = count - 1; // different number cancels a vote
//             }
//         }

//         return candidate;
//     }