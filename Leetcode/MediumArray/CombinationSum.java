// https://leetcode.com/problems/combination-sum/description/
// 39. Combination Sum

// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.


// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.
// Example 2:

// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2],[2,3,3],[3,5]]
// Example 3:

// Input: candidates = [2], target = 1
// Output: []

package Leetcode.MediumArray;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        
        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return; // prune
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);

            // IMPORTANT: i (not i+1) because we can reuse same element
            backtrack(candidates, target - candidates[i], i, current, result);

            // backtrack
            current.remove(current.size() - 1);
        }
    }

}
// 🧪 Example 1
// candidates = [2,3], target = 5
// Start
// current = []
// target = 5
// Step-by-step (think like decisions)
// Pick 2
// [2], target = 3
// Pick 2 again (allowed)
// [2,2], target = 1
// Pick 2 again
// [2,2,2], target = -1 ❌

// Dead → BACKTRACK

// [2,2]
// Try next → pick 3
// [2,2,3], target = -2 ❌

// Dead → BACKTRACK

// [2,2] → back → [2]
// From [2], try 3
// [2,3], target = 0 ✅

// SAVE: [2,3]

// Backtrack:

// [2] → []
// Now start with 3
// [3], target = 2
// Try 3 again
// [3,3], target = -1 ❌

// No more options → done

// ✅ Result:
// [[2,3]]
// ⚠️ What just happened (important)
// You explored one path fully before trying next
// You undid choices after each path
// You never went backwards in index → avoids duplicates
// 🧪 Example 2 (More interesting)
// candidates = [2,3,5], target = 8
// Start
// []
// Branch 1 → Start with 2
// [2] → 6
// [2,2] → 4
// [2,2,2] → 2
// [2,2,2,2] → 0 ✅

// Save:

// [2,2,2,2]

// Backtrack step by step:

// [2,2,2]

// Try next → 3:

// [2,2,2,3] → -1 ❌

// Try 5:

// [2,2,2,5] → -3 ❌

// Backtrack:

// [2,2]
// From [2,2], try 3
// [2,2,3] → 1

// Try 3:

// [2,2,3,3] → -2 ❌

// Backtrack → try 5:

// [2,2,3,5] → -2 ❌

// Backtrack:

// [2,2]
// From [2,2], try 5
// [2,2,5] → -1 ❌

// Backtrack:

// [2]
// From [2], try 3
// [2,3] → 3

// Try 3:

// [2,3,3] → 0 ✅

// Save:

// [2,3,3]
// From [2], try 5
// [2,5] → 1 ❌

// Backtrack to:

// []
// Branch 2 → Start with 3
// [3] → 5
// [3,3] → 2
// [3,3,3] → -1 ❌

// Backtrack → try 5:

// [3,5] → 0 ✅

// Save:

// [3,5]
// Branch 3 → Start with 5
// [5] → 3
// [5,5] → -2 ❌

// Done.

// ✅ Final Answer:
// [
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
// ]