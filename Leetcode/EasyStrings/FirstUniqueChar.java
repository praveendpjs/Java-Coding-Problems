// https://leetcode.com/problems/first-unique-character-in-a-string/
// 387. First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:

// Input: s = "leetcode"

// Output: 0

// Explanation:

// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:

// Input: s = "loveleetcode"

// Output: 2

// Example 3:

// Input: s = "aabb"

// Output: -1

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        // First pass: count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Second pass: find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
