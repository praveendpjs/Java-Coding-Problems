// https://leetcode.com/problems/keyboard-row/description/?envType=problem-list-v2&envId=wafs0t6v
// 500. Keyboard Row

// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

// Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

// Example 1:

// Input: words = ["Hello","Alaska","Dad","Peace"]

// Output: ["Alaska","Dad"]

// Explanation:

// Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

// Example 2:

// Input: words = ["omk"]

// Output: []

// Example 3:

// Input: words = ["adsdf","sfd"]

// Output: ["adsdf","sfd"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Keyboard{
    public String[] findWords(String[] words) {

        Set<Character> row1 = new HashSet<>(Arrays.asList(
                'q','w','e','r','t','y','u','i','o','p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList(
                'a','s','d','f','g','h','j','k','l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList(
                'z','x','c','v','b','n','m'));
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lower = word.toLowerCase();
            Set<Character> targetRow = getRow(lower.charAt(0), row1, row2, row3);
            
            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (!targetRow.contains(c)) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
    
    private Set<Character> getRow(char c, Set<Character> r1, Set<Character> r2, Set<Character> r3) {
        if (r1.contains(c)) return r1;
        if (r2.contains(c)) return r2;
        return r3;
    }
}