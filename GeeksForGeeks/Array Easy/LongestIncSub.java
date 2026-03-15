// https://www.geeksforgeeks.org/problems/sachins-love-for-runs2217/1?page=1&difficulty=Easy&sortBy=difficulty
// Longest Increasing subarray
// Difficulty: EasyAccuracy: 38.78%Submissions: 4K+Points: 2
// You are given an array arr. Return length of the maximum non-decreasing sub-segment in sequence arr.

// Examples:

// Input: arr[] = [2, 2, 1, 3, 4, 1]
// Output: 3
// Explanation: The maximum non-decreasing sub-segment is the segment with numbers from the third to the fifth one.
// Input: arr[] = [2, 2, 9]
// Output: 3
// Explanation: The maximum non-decreasing sub-segment is the numbers from the first to the third one.

// Did it myself
public class LongestIncSub {
    public static int compute(int arr[]) {
        // write your code here
        int count = 1;
        int maxCount = 1;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] >= arr[i]){
                count++;
                maxCount = Math.max(count,maxCount);
            }else{
                count = 1;
            }
        }
        return maxCount;
    }
}
