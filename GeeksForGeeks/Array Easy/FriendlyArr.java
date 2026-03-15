// https://www.geeksforgeeks.org/problems/friendly-array2009/1?page=1&sortBy=difficulty
// Numbers have a measure of friendliness defined as the absolute difference between them. Given an circular array of integers arr[], calculate the friendliness of the array. Friendliness is the sum of the absolute differences between each element and its closest friend in the array.

// Examples:

// Input: arr[] = [4, 1, 5]
// Output: 8
// Explanation: The sum of absolute differences with closest neighbors is |4-1| + |1-5| + |5-4| = 8.
// Input: arr[] = [1, 1, 1]
// Output: 0
// Explanation: All elements are identical, so the sum of differences is zero.

package GeeksForGeeks;
// This solution is not effective but I solved it by myself in first attempt
public class FriendlyArr {
    public int calculateFriendliness(int[] arr) {
        // code here
        int n = arr.length;
        int[] diffArr = new int[n];
        int index = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            int curr = arr[i];
            int next = arr[(i + 1) % n];
            int diff = Math.abs(curr - next);
            diffArr[index++] = diff;
        }
        for(int num : diffArr){
            sum += num;
        }
        return sum;
        
    }
    public static void main(String[] args) {
        
    }
}

// Effective solution is here
// public int calculateFriendliness(int[] arr) {
//         // code here
//         int n = arr.length;
//         int sum = 0;

//         for (int i = 0; i < n; i++) {
//             int curr = arr[i];
//             int next = arr[(i + 1) % n];
//             sum += Math.abs(curr - next);
//             }

//         return sum; 
//     }
