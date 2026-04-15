// https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1?page=1&category=Strings&difficulty=Easy&sortBy=difficulty
// String Duplicates Removal
// Given a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

// Example 1:

// Input: s = "geEksforGEeks"
// Output: "geEksforG"
// Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
// Example 2:

// Input: s = "HaPpyNewYear"
// Output: "HaPpyNewYr"
// Explanation: After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".

package GeeksForGeeks.Strings;

import java.util.LinkedHashSet;

// Did it myself
public class StringDuprem {
    String removeDuplicates(String s) {
        char[] c1 = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : c1){
            set.add(c);
        }
        String result = "";
        for(char c: set){
            result += c;
        }
        return result;
    }
}
