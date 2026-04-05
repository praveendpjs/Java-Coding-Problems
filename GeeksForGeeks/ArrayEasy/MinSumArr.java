// https://www.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/1?page=1&difficulty=Easy&sortBy=difficulty

// Min sum formed by digits
// Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. All digits of the given array must be used to form the two numbers.

// Any combination of digits may be used to form the two numbers to be summed.  Leading zeroes are permitted.

// If forming two numbers is impossible (i.e. when n==0) then the "sum" is the value of the only number that can be formed.

// Example 1:

// Input:
// N = 6
// arr[] = {6, 8, 4, 5, 2, 3}
// Output:
// 604
// Explanation:
// The minimum sum is formed by numbers 
// 358 and 246

// Example 2:

// Input:
// N = 5
// arr[] = {5, 3, 0, 7, 4}
// Output:
// 82
// Explanation:
// The minimum sum is formed by numbers 
// 35 and 047
package GeeksForGeeks;

import java.util.Arrays;

public class MinSumArr {
    public static long minSum(int arr[], int n) {
        Arrays.sort(arr);

        long num1 = 0;
        long num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + arr[i];
            } else {
                num2 = num2 * 10 + arr[i];
            }
        }
        return num1 + num2;
    }

    public static void main(String[] args) {

    }
}

// N = 6
// arr = {6, 8, 4, 5, 2, 3}
// Step 1: Sort the digits
// If you don’t sort, you’re already wrong.

// Sorted arr = [2, 3, 4, 5, 6, 8]
// Small digits must go into higher place values. That’s the entire game.

// Step 2: Initialize two numbers
// num1 = 0
// num2 = 0
// Step 3: Distribute digits alternately
// We iterate over the sorted array.

// i	arr[i]	i % 2	Action	num1	num2
// 0	2	0	num1 = 0*10 + 2	2	    0
// 1	3	1	num2 = 0*10 + 3	2	    3
// 2	4	0	num1 = 2*10 + 4	24	    3
// 3	5	1	num2 = 3*10 + 5	24	    35
// 4	6	0	num1 = 24*10 + 6    246	35
// 5	8	1	num2 = 35*10 + 8	246	358
// Step 4: Final numbers
// num1 = 246
// num2 = 358
// Step 5: Sum
// 246 + 358 = 604