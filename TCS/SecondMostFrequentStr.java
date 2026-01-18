// https://www.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1
// Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.

// Note: No two strings are the second most repeated, there will be always a single string.

// Example 1:

// Input:
// N = 6
// arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
// Output: bbb
// Explanation: "bbb" is the second most 
// occurring string with frequency 2.
package TCS;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentStr {
    public static String secondMostRepeated(String[] arr, int n) {
        HashMap<String, Integer> freq = new HashMap<>();

        // Count frequencies
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        String first = "", second = "";
        int firstMax = 0, secondMax = 0;

        // Find first and second max
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            int count = e.getValue();
            String word = e.getKey();

            if (count > firstMax) {
                secondMax = firstMax;
                second = first;

                firstMax = count;
                first = word;
            } 
            else if (count > secondMax) {
                secondMax = count;
                second = word;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        System.out.println(secondMostRepeated(arr, arr.length)); // bbb
    }
}
