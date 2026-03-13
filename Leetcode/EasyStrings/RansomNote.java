// https://leetcode.com/problems/ransom-note/description/?envType=problem-list-v2&envId=wn864o4j

// 383. Ransom Note

// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.


// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true


package Leetcode.EasyStrings;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c: ransomNote.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0) + 1);
        }

        for(char c: magazine.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0) + 1);
        }


        for(Map.Entry<Character,Integer> e:map1.entrySet()){
            char key = e.getKey();
            int value = e.getValue();
            if(!map2.containsKey(key) || map2.get(key) < value){
                return false;
            }
        }
        return true;
    }
}
