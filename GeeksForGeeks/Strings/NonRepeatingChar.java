// https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?page=1&category=Strings&difficulty=Easy&sortBy=submissions
// Non Repeating Character
// Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.

// Examples:

// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.
// Input: s = "racecar"
// Output: 'e'
// Explanation: In the given string, 'e' is the only character in the string which does not repeat.
// Input: s = "aabbccc"
// Output: '$'
// Explanation: All the characters in the given string are repeating.

package GeeksForGeeks.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {
    public char nonRepeatingChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            char key = e.getKey();
            int value = e.getValue();
            
            if(value == 1){
                return key;
            }
        }
        return '$';
    }
}
