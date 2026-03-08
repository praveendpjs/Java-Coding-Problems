// https://leetcode.com/problems/degree-of-an-array/description/?envType=problem-list-v2&envId=wafs0t6v
// 697. Degree of an Array

// Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

// Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.


// Example 1:

// Input: nums = [1,2,2,3,1]
// Output: 2
// Explanation: 
// The input array has a degree of 2 because both elements 1 and 2 appear twice.
// Of the subarrays that have the same degree:
// [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
// The shortest length is 2. So return 2.
// Example 2:

// Input: nums = [1,2,2,3,1,4,2]
// Output: 6
// Explanation: 
// The degree is 3 because the element 2 is repeated 3 times.
// So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.

import java.util.HashMap;

public class DegreeOfArr{
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];

            count.put(num, count.getOrDefault(num, 0) + 1);

            first.putIfAbsent(num, i);

            last.put(num, i);
        }

        int degree = 0;

        for(int c : count.values()){
            degree = Math.max(degree, c);
        }

        int minLength = nums.length;

        for(int num : count.keySet()){

            if(count.get(num) == degree){

                int length = last.get(num) - first.get(num) + 1;

                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }
}

// nums = [1,2,2,3,1,4,2]
// index  0 1 2 3 4 5 6

// Three hash maps exist:

// count → frequency of number
// first → first index where number appears
// last  → last index where number appears

// Now we iterate through the array.

// i = 0
// num = 1

// Update count:

// count[1] = 1

// Store first occurrence:

// first[1] = 0

// Update last occurrence:

// last[1] = 0

// State now:

// count = {1:1}
// first = {1:0}
// last  = {1:0}
// i = 1
// num = 2

// Update count:

// count[2] = 1

// First occurrence:

// first[2] = 1

// Last occurrence:

// last[2] = 1

// State:

// count = {1:1, 2:1}
// first = {1:0, 2:1}
// last  = {1:0, 2:1}
// i = 2
// num = 2

// Frequency increases:

// count[2] = 2

// First stays the same because of putIfAbsent.

// Last updates:

// last[2] = 2

// State:

// count = {1:1, 2:2}
// first = {1:0, 2:1}
// last  = {1:0, 2:2}
// i = 3
// num = 3
// count[3] = 1
// first[3] = 3
// last[3]  = 3

// State:

// count = {1:1, 2:2, 3:1}
// first = {1:0, 2:1, 3:3}
// last  = {1:0, 2:2, 3:3}
// i = 4
// num = 1
// count[1] = 2
// last[1] = 4

// State:

// count = {1:2, 2:2, 3:1}
// first = {1:0, 2:1, 3:3}
// last  = {1:4, 2:2, 3:3}
// i = 5
// num = 4
// count[4] = 1
// first[4] = 5
// last[4]  = 5

// State:

// count = {1:2,2:2,3:1,4:1}
// first = {1:0,2:1,3:3,4:5}
// last  = {1:4,2:2,3:3,4:5}
// i = 6
// num = 2
// count[2] = 3
// last[2] = 6

// Final maps:

// count = {1:2, 2:3, 3:1, 4:1}
// first = {1:0, 2:1, 3:3, 4:5}
// last  = {1:4, 2:6, 3:3, 4:5}
// Step 2 — Find the degree

// Degree = max frequency.

// Look at count:

// 1 → 2
// 2 → 3
// 3 → 1
// 4 → 1

// So:

// degree = 3
// Step 3 — Check numbers with that degree

// Only number with frequency 3:

// 2

// Now compute its subarray length:

// first[2] = 1
// last[2]  = 6

// Length formula:

// last - first + 1

// So:

// 6 - 1 + 1 = 6

// Subarray:

// [2,2,3,1,4,2]

// Length:

// 6