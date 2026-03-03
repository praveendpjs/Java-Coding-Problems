// 345. Reverse Vowels of a String

// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

public class ReverseVowels{
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            
            // swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(arr);
    }
    public boolean isVowel(char s){
        return "aeiouAEIOU".indexOf(s) != -1;
    }
    // Or use this
    // private boolean isVowel(char c) {
    //     return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
    //            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    // }
}

// Example 1
// Input: "IceCreAm"

// Convert to char array:

// Index:  0 1 2 3 4 5 6 7
// Chars:  I c e C r e A m

// Vowels are: I, e, e, A

// Start:

// left = 0 → 'I' (vowel)
// right = 7 → 'm' (not vowel) → move right

// right = 6 → 'A' (vowel)

// Both are vowels → swap.

// After swap:

// A c e C r e I m

// left++ → 1
// right-- → 5

// left = 1 → 'c' (not vowel) → move left
// left = 2 → 'e' (vowel)

// right = 5 → 'e' (vowel)

// Swap.

// A c e C r e I m

// Looks same because both were 'e'. Still a valid swap.

// left++ → 3
// right-- → 4

// left = 3 → 'C' (not vowel) → move left
// left = 4 → 'r' (not vowel) → move left
// left = 5

// Now left >= right → stop.

// Final result:

// AceCreIm

// Exactly as expected.

// Notice something important:
// We didn’t “collect vowels.”
// We didn’t count them.
// We didn’t reverse a separate list.
// We just swapped when conditions matched.

// That’s algorithmic discipline.

// Example 2
// Input: "leetcode"

// Index:  0 1 2 3 4 5 6 7
// Chars:  l e e t c o d e

// Vowels: e, e, o, e

// Start:

// left = 0 → 'l' not vowel → move
// left = 1 → 'e' vowel

// right = 7 → 'e' vowel

// Swap.

// No visible change (e with e).

// left = 2
// right = 6

// left = 2 → 'e' vowel
// right = 6 → 'd' not vowel → move
// right = 5 → 'o' vowel

// Swap.

// Array becomes:

// l e o t c e d e

// left = 3
// right = 4

// left = 3 → 't' not vowel → move
// left = 4 → 'c' not vowel → move
// left = 5

// Now left >= right → stop.

// Final:

// leotcede