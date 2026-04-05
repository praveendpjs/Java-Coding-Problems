// https://www.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1?page=1&difficulty=Easy&sortBy=difficulty
// Most Frequent Element in an Array
// You are given an integer array arr[]. You need to return the element which occurs maximum times in arr[].
// Note: If multiple such elements exists return the maximum element.

// Example: 

// Input: arr[] = [1, 2, 2, 2, 4, 1]
// Output: 2
// Explanation: 2 is most frequent element of this array with 3 occurrences.
// Input: arr[] = [1, -5, 8, 1]
// Output: 1
// Explanation: 1 is most frequent element of this array with 2 occurrences.
// Input: arr[] = [3, 0, 0, 3, 8]
// Output: 3
// Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.

package GeeksForGeeks;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public int mostFreqEle(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int result = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                result = element;
            } else if (freq == maxFreq && element > result) {
                result = element;
            }
        }

        return result;
    }
}
