// https://www.geeksforgeeks.org/problems/find-the-closest-number5513/1?page=1&difficulty=Easy&sortBy=difficulty
// Find the closest number
// Given a sorted array arr[] of positive integers. The task is to find the closest value in the array to the given number k. The array may contain duplicate values.
// Note: If the difference with k is the same for two values in the array return the greater value.

// Examples :

// Input:  arr[] = [1, 3, 6, 7], k = 4
// Output: 3
// Explanation: We have array arr={1, 3, 6, 7} and target is 4. If we look at the absolute difference of target with every element of the array we will get { |1-4|, |3-4|, |6-4|, |7-4| }  = {3, 1, 2, 3}. So, the closest number is 3.
// Input: arr[] = [1, 2, 3, 5, 6, 8, 9], k = 4
// Output: 5
// Explanation: The absolute difference of 4 is 1 from both 3 and 5. According to the question, we have to return greater value, which is 5.
// Input: arr[] = [6, 8, 8, 8, 9, 11, 13, 13, 15, 18, 19], k = 10
// Output: 11

package GeeksForGeeks;
// I lowkey solved myself without asking israelGPT
public class ClosestNum {
    public static int findClosest(int[] arr, int k) {
        // code here
        int low = Integer.MAX_VALUE;
        int target = 0;
        for(int i = 0; i < arr.length; i++){
            int diff = Math.abs(arr[i] - k);
            if(diff <= low){
                low = diff;
                target = arr[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
        
    }
}
