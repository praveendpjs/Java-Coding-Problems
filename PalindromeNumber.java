// Given an integer x, return true if x is a palindrome, and false otherwise.


// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

// 1) Two-pointer approach
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Two-Pointer Approach

        // Step1: Convert the integer into string.
        // Step2: Point two variable at first and last indices of the string.
        // Step3: Compare the characters at those indices.
        // Step4: Update the variables.

        String s = String.valueOf(x); // convert integer to string.

        int i = 0; // i will initially point to first index.
        int j = s.length() - 1; // j will initially point to last index.

        // i and j are opposite indices of the string.
        // 1. If 'i' is first then 'j' is last.
        // 2. Similarly, if 'i' is second then 'j' is second last index of s.
        // This is because they are updated simultaneously.

        while (i <= j) // loop will break when i and j cross each other
        {
            if (s.charAt(i) != s.charAt(j)) // characters at indices i and j will be compared.
                // If the characters are unequal then false will be returned.
                return false;
            i++; // i is incremented.
            j--; // j is decremented.
        }

        // If loop ends without returning false, it means that every 'ith' character
        // is equal to every 'jth' character. Thus, the number is palindrome.
        // Hence, return true;

        return true;
    }
}

// 2)The same two pointer approach but convert str to char array
// public class Geeks
//  {
//     public static boolean isPalindrome(String s) {

//         // Convert the string to char array for easier access
//         char[] arr = s.toCharArray();

//         // Two pointers: one at the start
//         // and one at the end
//         int l = 0, r = arr.length - 1;

//         // Compare characters from both ends moving toward the center
//         while (l < r) {
//             if (arr[l] != arr[r]) {
//                 return false;  
//             }
//             // Move left pointer to the right
//             l++; 
//             // Move right pointer to the left  
//             r--;  
//         }

//         return true;  // Return true if all characters match
//     }

//     public static void main(String[] args) {
//         String s = "12345654321";
        
//         // Checking if the string is a palindrome
//         if (isPalindrome(s)) {
//             System.out.println(s + " is a palindrome.");
//         } else {
//             System.out.println(s + " is not a palindrome.");
//         }
//     }
// }