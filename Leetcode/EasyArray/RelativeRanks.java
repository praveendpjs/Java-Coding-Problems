// https://leetcode.com/problems/relative-ranks/description/?envType=problem-list-v2&envId=wafs0t6v
// 506. Relative Ranks

// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.


// Example 1:

// Input: score = [5,4,3,2,1]
// Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
// Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
// Example 2:

// Input: score = [10,3,8,9,4]
// Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
// Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

import java.util.Arrays;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i]; // score
            arr[i][1] = i;        // original index
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            int originalIndex = arr[i][1];

            if (i == 0) result[originalIndex] = "Gold Medal";
            else if (i == 1) result[originalIndex] = "Silver Medal";
            else if (i == 2) result[originalIndex] = "Bronze Medal";
            else result[originalIndex] = String.valueOf(i + 1);
    }

    return result;
    }
}

// score = [10, 3, 8, 9, 4]

// Step 1 — Basic setup

// n = 5
// result = new String[5]
// arr = new int[5][2]


// At this point:

// result = [null, null, null, null, null]
// arr = 5 rows, 2 columns


// Step 2 — Fill arr with (score, originalIndex)

// Loop runs from i = 0 to 4.

// After the loop:

// arr =
// [10, 0]
// [ 3, 1]
// [ 8, 2]
// [ 9, 3]
// [ 4, 4]


// This is the key idea.

// We are not sorting score directly.

// We’re storing:

// arr[i][0] → score

// arr[i][1] → where it came from

// If you skip this step, your solution collapses. Because once sorted, original positions are lost.

// Step 3 — Sort descending by score

// This line:

// Arrays.sort(arr, (a, b) -> b[0] - a[0]);


// Sorts by first column in descending order.

// After sorting:

// arr =
// [10, 0]
// [ 9, 3]
// [ 8, 2]
// [ 4, 4]
// [ 3, 1]


// Notice something crucial.

// Index 3 (score 9) jumped upward.
// Index 1 (score 3) dropped downward.

// But original index is preserved in column 1.

// This is the entire trick.

// Step 4 — Assign ranks

// Now we iterate from i = 0 to 4.

// Remember:
// i represents placement (0-based)
// So rank = i + 1

// Iteration 1:
// i = 0
// arr[0] = [10, 0]
// originalIndex = 0

// Since i == 0:
// result[0] = "Gold Medal"

// result becomes:
// ["Gold Medal", null, null, null, null]

// Iteration 2:
// i = 1
// arr[1] = [9, 3]
// originalIndex = 3

// Since i == 1:
// result[3] = "Silver Medal"

// result:
// ["Gold Medal", null, null, "Silver Medal", null]

// Iteration 3:
// i = 2
// arr[2] = [8, 2]
// originalIndex = 2

// Since i == 2:
// result[2] = "Bronze Medal"

// result:
// ["Gold Medal", null, "Bronze Medal", "Silver Medal", null]

// Iteration 4:
// i = 3
// arr[3] = [4, 4]
// originalIndex = 4

// i >= 3:
// result[4] = "4"

// result:
// ["Gold Medal", null, "Bronze Medal", "Silver Medal", "4"]

// Iteration 5:
// i = 4
// arr[4] = [3, 1]
// originalIndex = 1

// result[1] = "5"

// Final result:
// ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]

// Return that.

// Done.

// Another solution using maps
// public String[] findRelativeRanks(int[] score) {
//     int n = score.length;
//     String[] result = new String[n];

//     // Clone and sort descending
//     int[] sorted = score.clone();
//     Arrays.sort(sorted);

//     // Map score -> rank
//     Map<Integer, Integer> rankMap = new HashMap<>();
//     int rank = 1;

//     for (int i = n - 1; i >= 0; i--) {
//         rankMap.put(sorted[i], rank++);
//     }

//     // Build result using map lookup
//     for (int i = 0; i < n; i++) {
//         int r = rankMap.get(score[i]);

//         if (r == 1) result[i] = "Gold Medal";
//         else if (r == 2) result[i] = "Silver Medal";
//         else if (r == 3) result[i] = "Bronze Medal";
//         else result[i] = String.valueOf(r);
//     }

//     return result;
// }
