// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=1&sortBy=difficulty
// Min and Max in Array
// Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

// Examples:

// Input: arr[] = [1, 4, 3, 5, 8, 6]
// Output: [1, 8]
// Explanation: minimum and maximum elements of array are 1 and 8.
// Input: arr[] = [12, 3, 15, 7, 9]
// Output: [3, 15]
// Explanation: minimum and maximum element of array are 3 and 15.

package GeeksForGeeks;

import java.util.ArrayList;

public class MaxandMin {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> result = new ArrayList<>(); 
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max){
                max = arr[i];
            }
        }
        result.add(min);
        result.add(max);
        return result;
    }
    public static void main(String[] args) {
        
    }
}
