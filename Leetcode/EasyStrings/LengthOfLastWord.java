// https://leetcode.com/problems/length-of-last-word/description/
// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // count letters in last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}

// Not optimal code
// class Solution {
//     public int lengthOfLastWord(String s) {
        
//         int ans = 0;
//         String[] arr = s.split(" ");
        
//         for (int i = 0; i < arr.length; i++) {
//             ans = arr[i].length();
//         }
//         return ans;
//     }
// }
// https://www.youtube.com/watch?v=SBByYcrsXu0   watch this video for split() function
