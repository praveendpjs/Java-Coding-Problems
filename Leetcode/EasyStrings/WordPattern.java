// https://leetcode.com/problems/word-pattern/description/?envType=problem-list-v2&envId=wn864o4j
// 290. Word Pattern

// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"

// Output: true

// Explanation:

// The bijection can be established as:

// 'a' maps to "dog".
// 'b' maps to "cat".
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"

// Output: false

// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"

// Output: false



package Leetcode.EasyStrings;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char p = pattern.charAt(i);
            String w = words[i];

            if (map1.containsKey(p) && !map1.get(p).equals(w)) {
                return false;
            }

            if (map2.containsKey(w) && map2.get(w) != p) {
                return false;
            }

            map1.put(p, w);
            map2.put(w, p);
        }

        return true;
    }
}

// Iteration 1

// Index 0

// pattern char = 'a'
// word = "dog"

// Maps are empty.

// So we store the mapping.

// charToWord: a -> dog
// wordToChar: dog -> a

// Everything consistent.

// Iteration 2

// Index 1

// pattern char = 'b'
// word = "cat"

// Check maps:

// b not mapped yet
// cat not mapped yet

// So we add them.

// charToWord: 
// a -> dog
// b -> cat

// wordToChar:
// dog -> a
// cat -> b

// Still valid.

// Iteration 3

// Index 2

// pattern char = 'b'
// word = "cat"

// Now we check consistency.

// b already maps to "cat".

// That matches the current word.

// So the relationship still holds.

// Maps stay the same.

// Iteration 4

// Index 3

// pattern char = 'a'
// word = "dog"

// Check existing mapping:

// a -> dog

// Matches again.

// Everything is consistent.

// Loop ends.

// No rule violated.

// Return true.

// Now let’s break it intentionally.

// Example:

// pattern = "abba"
// s = "dog cat cat fish"

// Split words:

// ["dog","cat","cat","fish"]

// Walk through until failure.

// Index 0

// a -> dog
// dog -> a

// Index 1

// b -> cat
// cat -> b

// Index 2

// b -> cat

// Still consistent.

// Index 3

// pattern char = 'a'
// word = "fish"

// But our map already says:

// a -> dog

// Now the program sees:

// expected: dog
// actual: fish

// Mismatch detected.

// Return false immediately.