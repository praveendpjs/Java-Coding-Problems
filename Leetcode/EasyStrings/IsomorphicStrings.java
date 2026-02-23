// https://leetcode.com/problems/isomorphic-strings/description/?envType=problem-list-v2&envId=wn864o4j
// 205. Isomorphic Strings

// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "f11", t = "b23"

// Output: false

// Explanation:

// The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

// Example 3:

// Input: s = "paper", t = "title"

// Output: true

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
        return false;

    HashMap<Character, Character> mapST = new HashMap<>();
    HashMap<Character, Character> mapTS = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {

        char c1 = s.charAt(i);
        char c2 = t.charAt(i);

        if (mapST.containsKey(c1)) {
            if (mapST.get(c1) != c2)
                return false;
        } else {
            mapST.put(c1, c2);
        }

        if (mapTS.containsKey(c2)) {
            if (mapTS.get(c2) != c1)
                return false;
        } else {
            mapTS.put(c2, c1);
        }
    }

    return true;
    }
}

// Now walk through "paper" and "title" step-by-step.

// Initial state
// mapST = {}
// mapTS = {}

// Think of:

// mapST = s → t
// mapTS = t → s

// Two-way lock. No cheating allowed.

// Step 1: i = 0
// c1 = 'p'
// c2 = 't'

// Check:

// mapST.containsKey('p') → false

// So create mapping:

// mapST.put('p', 't')

// Now reverse check:

// mapTS.containsKey('t') → false

// Create reverse mapping:

// mapTS.put('t', 'p')

// State now:

// mapST = { p → t }
// mapTS = { t → p }

// Everything consistent.

// Step 2: i = 1
// c1 = 'a'
// c2 = 'i'

// Check forward:

// mapST.containsKey('a') → false

// Add:

// mapST = { p→t, a→i }

// Check reverse:

// mapTS.containsKey('i') → false

// Add:

// mapTS = { t→p, i→a }

// Still valid.

// Step 3: i = 2
// c1 = 'p'
// c2 = 't'

// Check forward:

// mapST.containsKey('p') → true
// mapST.get('p') = 't'

// Expected = actual → OK

// Check reverse:

// mapTS.containsKey('t') → true
// mapTS.get('t') = 'p'

// Expected = actual → OK

// State unchanged.

// Step 4: i = 3
// c1 = 'e'
// c2 = 'l'

// New mapping:

// mapST = { p→t, a→i, e→l }
// mapTS = { t→p, i→a, l→e }

// Still clean.

// Step 5: i = 4
// c1 = 'r'
// c2 = 'e'

// New mapping:

// mapST = { p→t, a→i, e→l, r→e }
// mapTS = { t→p, i→a, l→e, e→r }

// Loop ends.

// Return:

// true
// Now watch failure case: "foo" and "bar"

// Start:

// mapST = {}
// mapTS = {}

// Step 1:

// f → b

// Step 2:

// o → a

// Step 3:

// o → r

// Now check:

// mapST.containsKey('o') → true
// mapST.get('o') = 'a'

// Expected 'r'
// Actual 'a'

// Mismatch → return false

// Explosion. Mapping inconsistency detected.

// Why TWO maps are mandatory

// This case exposes weak implementations:

// s = ab
// t = cc

// If you use only one map:

// a → c
// b → c   ❌ illegal

// Two characters mapping to same target breaks isomorphism.

// Second map catches it immediately:

// mapTS.containsKey('c') → true
// mapTS.get('c') = 'a'

// but now trying c → b
// Mismatch → return false
// Mental model that makes this effortless

