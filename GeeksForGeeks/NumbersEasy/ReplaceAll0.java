// https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=1&sortBy=difficulty
// Replace all 0's with 5
// Difficulty: BasicAccuracy: 75.55%Submissions: 107K+Points: 1Average Time: 15m
// You are given an integer n. You need to convert all zeroes of n to 5.

// Examples:

// Input: n = 1004
// Output: 1554
// Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.
// Input: n = 121
// Output: 121
// Explanation: Since there are no zeroes in 121, the number remains as 121.

package GeeksForGeeks.NumbersEasy;

public class ReplaceAll0 {
    int convertfive(int num) {
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '5';
            }
        }
        
        // Convert the modified array back to a String, then to an Integer
        return Integer.parseInt(new String(arr));
        
    }
}

// Math solution:
// int convertfive(int n) {
//         // Base case for single zero
//         if (n == 0) return 5;

//         int result = 0;
//         int placeValue = 1;

//         while (n > 0) {
//             int digit = n % 10;
            
//             // Replace 0 with 5
//             if (digit == 0) {
//                 digit = 5;
//             }
            
//             // Add digit back to its correct position
//             result = result + (digit * placeValue);
            
//             // Move to next position and next digit
//             placeValue *= 10;
//             n /= 10;
//         }
        
//         return result;
//     }
