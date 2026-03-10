// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// 3. Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without duplicate characters.


// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

package Leetcode.MediumStrings;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            while (list.contains(c)) {
                list.remove(0);
            }

            list.add(c);
            max = Math.max(max, list.size());
        }

        return max;
    }
}

// Let’s use the string:

// abcabcbb

// Length should be 3.

// Step 1
// right = 0
// c = 'a'

// List currently:

// []

// Check duplicate:

// list.contains('a') → false

// Add it.

// list = [a]
// max = 1

// Window now:

// [a]
// Step 2
// right = 1
// c = 'b'

// Check duplicate:

// [a] contains 'b'? → no

// Add.

// list = [a, b]
// max = 2

// Window:

// [a, b]
// Step 3
// right = 2
// c = 'c'

// Check duplicate:

// [a,b] contains 'c'? → no

// Add.

// list = [a,b,c]
// max = 3

// Window:

// [a,b,c]

// So far the substring is:

// abc
// Step 4 (first duplicate appears)
// right = 3
// c = 'a'

// Current window:

// [a,b,c]

// Check duplicate:

// contains('a') → YES

// Now the while loop activates.

// Remove from the left.

// list.remove(0)

// Now:

// [b,c]

// left++ happens but it's not actually used for indexing in this version.

// Now check again:

// [b,c] contains 'a'? → NO

// Now we add the new character.

// list = [b,c,a]
// max = 3

// Window now represents:

// bca

// The window slid forward instead of restarting.

// Step 5
// right = 4
// c = 'b'

// Window:

// [b,c,a]

// Duplicate detected.

// contains('b') → YES

// Remove from left.

// remove(0)

// Now:

// [c,a]

// Check again:

// contains('b') → NO

// Add.

// list = [c,a,b]
// max = 3

// Window:

// cab
// Step 6
// right = 5
// c = 'c'

// Duplicate again.

// [c,a,b] contains 'c'

// Remove left.

// [a,b]

// Check again.

// [a,b] contains 'c'? → NO

// Add.

// list = [a,b,c]
// max = 3

// Window:

// abc
// Step 7
// right = 6
// c = 'b'

// Duplicate.

// [a,b,c] contains 'b'

// Remove:

// remove a → [b,c]

// Still duplicate.

// [b,c] contains 'b'

// Remove again:

// remove b → [c]

// Now safe.

// Add:

// [c,b]

// max still 3

// Step 8
// right = 7
// c = 'b'

// Duplicate.

// [c,b] contains 'b'

// Remove:

// remove c → [b]

// Still duplicate.

// remove b → []

// Add.

// [b]
// Final Answer
// max = 3

// Correct.

// The deeper idea hiding here

// The window behaves like a rubber band sliding across the string.

// It expands:

// right →

// And contracts when the rule breaks:

// left →

// The invariant (fancy word for rule):

// window always contains unique characters

// The moment that rule breaks, the window self-repairs by ejecting characters from the left.

// That idea — maintaining a moving valid region — is one of the most powerful algorithmic tricks in interviews.

// Sliding window problems are basically constraint management over a moving boundary.

// Once that mental model clicks, a whole family of Leetcode problems suddenly look like the same puzzle wearing different hats.


// I tried this solution does not clear certain cases
// public int lengthOfLongestSubstring(String s) {
//         List<Character> list = new ArrayList<>();
//         int max = 0;
//         for(int i = 0; i < s.length(); i++){
//             char c = s.charAt(i);
//             if(list.contains(c)){
//                 list.clear();
//             }
//             list.add(c);
//             max = Math.max(max, list.size());
//         }
//         return max;
//     }