// https://www.geeksforgeeks.org/problems/maximum-gap3845/1?page=1&difficulty=Easy&sortBy=difficulty
// Maximum Gap
// Given an array arr[] of positive elements. Your have to find the maximum difference between its two consecutive elements in its sorted form.
// Return 0 if the array contains less than 2 elements.

// Examples:

// Input: arr[] = [1, 10, 5]
// Output: 5
// Explanation: The maximum difference between consecutive elements of array is 5 i.e, (10 - 5).
// Input: arr[] = [2, 4, 8, 11]
// Output: 4
// Explanation: The maximum difference between consecutive elements of array is 4 i.e, (8 - 4).

package GeeksForGeeks;

import java.util.Arrays;
// I did this easy level solution myself without asking isrealGPT even for once. 
public class MaximumGap {
    int maxDiff(int[] arr) {
        // code here
        if(arr.length < 2){
            return 0;
        }
        
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            int diff =  arr[i] - arr[i - 1];
            if(diff > max){
                max = diff;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}
