
// Reverse a string using recursion
public class RevStringRecursions{
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        // 1. Convert the string to a character array so we can modify it
        char[] chars = str.toCharArray();
        
        // 2. Call a helper method to do the recursive swapping
        reverseHelper(chars, 0, chars.length - 1);
        
        // 3. Convert the array back into a String
        return new String(chars);
    }

    // Helper method that uses two pointers: 'left' and 'right'
    private static void reverseHelper(char[] chars, int left, int right) {
        // Base case: If the pointers meet or cross, we are done swapping.
        if (left >= right) {
            return;
        }
        
        // The swap logic you mentioned: temp = a; a = b; b = temp;
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        
        // Recursive step: move left pointer forward, right pointer backward
        reverseHelper(chars, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: olleh
    }
}

// Reverse a string normal method
public static String reverseIterative(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // 1. Convert to a character array
        char[] chars = str.toCharArray();
        
        // 2. Set up two pointers (one at the start, one at the end)
        int left = 0;
        int right = chars.length - 1;
        
        // 3. Keep swapping until the pointers meet in the middle
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move pointers inward
            left++;
            right--;
        }
        
        // 4. Convert back to a String
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseIterative("world")); // Output: dlrow
    }