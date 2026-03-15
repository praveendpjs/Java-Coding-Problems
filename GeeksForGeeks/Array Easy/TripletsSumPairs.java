// https://www.geeksforgeeks.org/problems/find-all-distinct-triplets-with-given-sum/1?page=1&difficulty=Easy&sortBy=difficulty
// Find all distinct triplets with given sum
// Given an array arr[], and an integer target, find all possible unique triplets in the array whose sum is equal to the given target value. We can return triplets in any order, but all the returned triplets should be internally sorted, i.e., for any triplet [q1, q2, q3], the condition q1 ≤ q2 ≤ q3 should hold.

// Examples:

// Input: arr[] = [12, 3, 6, 1, 6, 9], target = 24 
// Output: [[3, 9, 12], [6, 6, 12]]
// Explanation: Triplets with sum 24 are (3, 9, 12) and (6, 6, 12). 
// Input: arr[] = [1, 1, 1, 1], target = 3
// Output: [[1, 1, 1]]
// Explanation: Triplets with sum 3 are (1, 1, 1). 
// Input: arr[] = [10, 12, 10, 15], target = 32
// Output: [[10, 10, 12]]
// Explanation: Triplets with sum 32 are (10, 10, 12).
package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSumPairs {
    public List<List<Integer>> threeSum(int[] arr, int target) {
        // Your code here
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);  // Step 1: sort

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    left++;
                    right--;

                    // Skip duplicates for second element
                    while (left < right && arr[left] == arr[left - 1]) left++;

                    // Skip duplicates for third element
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } 
                else if (sum < target) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        
    }
}
