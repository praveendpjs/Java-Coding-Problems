// https://leetcode.com/problems/isomorphic-strings/description/?envType=problem-list-v2&envId=wn864o4j
// 231. Power of Two

// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16
// Example 3:

// Input: n = 3
// Output: false
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        
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

