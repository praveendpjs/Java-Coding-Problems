package GeeksForGeeks;
// https://www.geeksforgeeks.org/problems/find-unique-pair-in-an-array-with-pairs-of-numbers2425/1?page=1&difficulty=Easy&sortBy=difficulty
// Find Unique pair in an array with pairs of numbers
// Difficulty: EasyAccuracy: 29.91%Submissions: 4K+Points: 2
// Given an array arr where every element appears twice except a pair (two elements). Return the elements of this unique pair in sorted order.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Examples:

// Input: arr[] = [2, 2, 5, 5, 6, 7]
// Output: [6, 7]
// Explanation: We can see we have [2, 2, 5, 5, 6, 7]. Here 2 and 5 are coming two times. So, the answer will be 6 7.
// Input : arr[] = [1, 3, 4, 1]
// Output : [3, 4]
// Explanation: 1 is appearing two times and 3 and 4 appear one times.

public class UniquePairs {
    public ArrayList<Integer> findUniquePair(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
