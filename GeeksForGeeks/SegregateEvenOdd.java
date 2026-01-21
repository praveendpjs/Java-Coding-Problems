// https://www.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1?page=1&sortBy=difficulty
// Segregate Even and Odd numbers
// Given an array arr, write a program segregating even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.

// Note:- You don't have to return the array, you have to modify it in-place.

// Example:

// Input: arr[] = [12, 34, 45, 9, 8, 90, 3]
// Output: [8, 12, 34, 90, 3, 9, 45]
// Explanation: Even numbers are 12, 34, 8 and 90. Rest are odd numbers.
// Input: arr[] = [0, 1, 2, 3, 4]
// Output: [0, 2, 4, 1, 3]
// Explanation: 0 2 4 are even and 1 3 are odd numbers.
// Input: arr[] = [10, 22, 4, 6]
// Output: [10, 22, 4, 6]
// Explanation: Here all elements are even, so no need of segregataion

package GeeksForGeeks;

import java.util.Arrays;

public class SegregateEvenOdd {
    void segregateEvenOdd(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        // Phase 1: segregate even and odd
        while (left <= right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Phase 2: sort evens and odds separately
        Arrays.sort(arr, 0, left);        // evens
        Arrays.sort(arr, left, arr.length); // odds
    }
    public static void main(String[] args) {
        
    }
}
