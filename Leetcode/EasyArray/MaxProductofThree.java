// https://leetcode.com/problems/maximum-product-of-three-numbers/description/?envType=problem-list-v2&envId=wafs0t6v
// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

// Example 1:

// Input: nums = [1,2,3]
// Output: 6
// Example 2:

// Input: nums = [1,2,3,4]
// Output: 24
// Example 3:

// Input: nums = [-1,-2,-3]
// Output: -6

import java.util.Arrays;

public class MaxProductofThree {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int max1 = nums[n-1] * nums[n-2] * nums[n-3];
        int max2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(max1, max2);
    }
}
