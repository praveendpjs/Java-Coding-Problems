// 18. 4Sum

// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]

package Leetcode.MediumArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {

                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
        
    }
}

// Take the classic example:

// nums = [1,0,-1,0,-2,2]
// target = 0

// First step in these problems is almost ritualistic.

// Sort the array.

// [-2, -1, 0, 0, 1, 2]

// Now the machine begins.

// We pick the first number (i), then the second number (j), and the rest becomes a 2-sum with two pointers.

// Step 1 — First loop
// i = 0
// nums[i] = -2

// Second loop starts.

// j = 1
// nums[j] = -1

// Now we search the remaining numbers using two pointers.

// left = j + 1 = 2
// right = 5

// Current numbers:

// [-2, -1, 0, 0, 1, 2]
//         L        R

// Compute sum:

// -2 + -1 + 0 + 2 = -1

// Too small.

// When the sum is too small, the only way to increase it is to move left forward.

// left++

// Now:

// left = 3
// right = 5

// Numbers:

// [-2, -1, 0, 0, 1, 2]
//            L     R

// Sum:

// -2 + -1 + 0 + 2 = -1

// Still too small.

// Move left again.

// left = 4

// Now:

// [-2, -1, 0, 0, 1, 2]
//               L  R

// Sum:

// -2 + -1 + 1 + 2 = 0

// Boom.

// We found a quadruplet.

// [-2, -1, 1, 2]

// Store it.

// Now the algorithm moves both pointers.

// left++
// right--

// Pointers become

// left = 5
// right = 4

// Loop ends because

// left >= right
// Step 2 — Move j
// j = 2
// nums[j] = 0

// Pointers reset.

// left = 3
// right = 5

// Array view:

// [-2, -1, 0, 0, 1, 2]
//         j  L     R

// Sum:

// -2 + 0 + 0 + 2 = 0

// Another hit.

// [-2, 0, 0, 2]

// Store it.

// Move pointers.

// left = 4
// right = 4

// Loop stops.

// Step 3 — Move j again
// j = 3
// nums[j] = 0

// But now something subtle happens.

// nums[3] == nums[2]

// Duplicate.

// So the algorithm skips it.

// Otherwise we'd produce the same quadruplet again.

// Step 4 — Move i

// Now outer loop continues.

// i = 1
// nums[i] = -1

// Second loop:

// j = 2
// nums[j] = 0

// Pointers:

// left = 3
// right = 5

// Array:

// [-2, -1, 0, 0, 1, 2]
//            j  L     R

// Sum:

// -1 + 0 + 0 + 2 = 1

// Too big.

// When the sum is too big, we move right backward.

// right--

// Now

// right = 4

// Sum again:

// -1 + 0 + 0 + 1 = 0

// Another quadruplet.

// [-1,0,0,1]

// Store it.

// Pointers move again.

// Loop ends.

// Final result
// [-2,-1,1,2]
// [-2,0,0,2]
// [-1,0,0,1]