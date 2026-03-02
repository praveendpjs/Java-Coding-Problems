// 645. Set Mismatch

// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.


// Example 1:

// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1]
// Output: [1,2]

public class SetMismatch{
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int[] result = new int[2];

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                result[0] = i; // duplicate
            } else if (freq[i] == 0) {
                result[1] = i; // missing
            }
        }

        return result;
    }
}

// You create:

// freq of size n + 1

// result[0] = duplicate

// result[1] = missing

// The key idea:
// Every number 1…n should appear exactly once.
// So:
// freq[i] == 2 → duplicate
// freq[i] == 0 → missing

// Let’s grind through multiple examples.

// Example 1
// nums = [1,2,2,4]

// Step 1
// n = 4
// freq = [0,0,0,0,0] (index 0 unused)

// Now we count.

// Read 1
// freq[1]++
// freq = [0,1,0,0,0]

// Read 2
// freq[2]++
// freq = [0,1,1,0,0]

// Read 2 again
// freq[2]++
// freq = [0,1,2,0,0]

// Read 4
// freq[4]++
// freq = [0,1,2,0,1]

// Now scan from 1 to 4.

// i = 1 → freq[1] = 1 → fine
// i = 2 → freq[2] = 2 → duplicate = 2
// i = 3 → freq[3] = 0 → missing = 3
// i = 4 → freq[4] = 1 → fine

// Return [2,3]

// Clean. Mechanical. No guessing.

// Example 2
// nums = [1,1]

// n = 2
// freq = [0,0,0]

// Count:

// Read 1 → freq[1] = 1
// Read 1 → freq[1] = 2

// freq = [0,2,0]

// Scan:

// i = 1 → freq[1] = 2 → duplicate = 1
// i = 2 → freq[2] = 0 → missing = 2

// Return [1,2]

// Still solid.

// Example 3
// nums = [2,2]

// n = 2
// freq = [0,0,0]

// Read 2 → freq[2] = 1
// Read 2 → freq[2] = 2

// freq = [0,0,2]

// Scan:

// i = 1 → freq[1] = 0 → missing = 1
// i = 2 → freq[2] = 2 → duplicate = 2

// Return [2,1]

// Notice something important.

// The duplicate is NOT necessarily near the missing number.
// This destroys your earlier “duplicate + 1” assumption.

// Example 4
// nums = [3,1,2,5,3]

// n = 5
// Original should be [1,2,3,4,5]

// Count:

// freq starts as [0,0,0,0,0,0]

// Read 3 → freq[3]=1
// Read 1 → freq[1]=1
// Read 2 → freq[2]=1
// Read 5 → freq[5]=1
// Read 3 → freq[3]=2

// freq = [0,1,1,2,0,1]

// Scan 1..5:

// 1 → ok
// 2 → ok
// 3 → duplicate
// 4 → missing
// 5 → ok

// Return [3,4]

// Works regardless of order. That’s power.

// Now let’s test a case that mentally breaks weaker logic.

// Example 5
// nums = [4,3,6,2,1,1]

// n = 6
// Original should be [1,2,3,4,5,6]

// Count:

// 1 → 1
// 1 → 2
// 2 → 1
// 3 → 1
// 4 → 1
// 6 → 1

// freq = [0,2,1,1,1,0,1]

// Scan:

// 1 → duplicate
// 2 → ok
// 3 → ok
// 4 → ok
// 5 → missing
// 6 → ok

// Return [1,5]

// Works perfectly even though:

// Duplicate is smallest

// Missing is somewhere in middle

// Array unsorted

// That’s robustness.