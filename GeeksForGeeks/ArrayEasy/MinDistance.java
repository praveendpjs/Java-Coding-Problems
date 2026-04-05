// https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?page=3&difficulty=Easy&sortBy=difficulty
// Minimum distance in an Array
// Difficulty: EasyAccuracy: 19.75%Submissions: 254K+Points: 2Average Time: 15m
// You are given an array, arr[]. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.

// Examples:

// Input: arr[] = [1, 2, 3, 2], x = 1, y = 2
// Output: 1
// Explanation: x = 1 and y = 2. There are two distances between x and y, which are 1 and 3 out of which the least is 1.
// Input: arr[] = [86, 39, 90, 67, 84, 66, 62], x = 42, y = 12
// Output: -1
// Explanation: x = 42 and y = 12. We return -1 as x and y don't exist in the array.
// Input: arr[] = [10, 20, 30, 40, 50], x = 10, y = 50
// Output: 4
// Explanation: The distance between x = 10 (index 0) and y = 50 (index 4) is 4, which is the only distance between them.

package GeeksForGeeks.Array Easy;

public class MinDistance {
    int minDist(int arr[], int x, int y) {
        int minDist = Integer.MAX_VALUE;
        int lastIndex = -1;
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == x || arr[i] == y){
                
                if(lastIndex != -1 && arr[i] != arr[lastIndex]){
                    minDist = Math.min(minDist, i - lastIndex);
                }
                
                lastIndex = i;
            }
        }
        
        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
    }
}
