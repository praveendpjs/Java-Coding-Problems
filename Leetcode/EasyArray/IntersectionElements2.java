// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// 350. Intersection of Two Arrays II

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.


// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.


public class IntersectionElements2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean[] used = new boolean[nums2.length];
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!used[j] && nums1[i] == nums2[j]) {
                    temp[k++] = nums1[i];
                    used[j] = true; // mark this index as used
                    break; // move to next element in nums1
                }
            }
        }

        // Copy only the filled portion into result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}

// Example
// nums1 = [1, 2, 2, 1]
// nums2 = [2, 2]

// Initial state:

// used  = [false, false]
// temp  = [0, 0]     // size = min(4,2)
// k = 0
// Iteration 1

// i = 0

// nums1[i] = 1

// Inner loop:

// j = 0 → nums2[0] = 2
// 1 != 2 → continue

// j = 1 → nums2[1] = 2
// 1 != 2 → continue

// No match.

// State unchanged:

// used = [false, false]
// temp = [0,0]
// k = 0
// Iteration 2

// i = 1

// nums1[i] = 2

// Inner loop:

// j = 0
// nums2[0] = 2
// used[0] = false

// Condition:

// !used[0] && nums1[i] == nums2[j]
// true && true

// Match found.

// Execute:

// temp[k++] = nums1[i]
// temp[0] = 2
// k = 1

// Mark used:

// used[0] = true

// Break inner loop.

// State now:

// used = [true, false]
// temp = [2,0]
// k = 1
// Iteration 3

// i = 2

// nums1[i] = 2

// Inner loop:

// j = 0
// nums2[0] = 2
// BUT used[0] = true

// So skip.

// j = 1
// nums2[1] = 2
// used[1] = false

// Match.

// temp[k++] = 2
// temp[1] = 2
// k = 2

// Mark used:

// used[1] = true

// Break.

// State:

// used = [true, true]
// temp = [2,2]
// k = 2
// Iteration 4

// i = 3

// nums1[i] = 1

// Inner loop:

// j = 0 → used already true
// j = 1 → used already true

// No match.

// End of loops

// Current arrays:

// temp = [2,2]
// k = 2
// Copy result
// result = new int[k]
// result = [0,0]

// Copy:

// result[0] = temp[0] → 2
// result[1] = temp[1] → 2

// Final result:

// [2,2]