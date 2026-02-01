// https://leetcode.com/problems/intersection-of-two-arrays/

// 349. Intersection of Two Arrays

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

import java.util.HashSet;
import java.util.Set;

public class IntersectionElements {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Put all elements of nums1 into a set
        for (int num : nums1) {
            set1.add(num);
        }

        // Check which elements of nums2 exist in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // ensures uniqueness
            }
        }

        // Convert result set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}

// Refer Humworld folder for same question with different answer (brute force)