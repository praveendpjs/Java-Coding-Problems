// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&difficulty=Easy&sortBy=difficulty
// Array Duplicates
// Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

// Note: You can return the elements in any order but the driver code will print them in sorted order.

// Examples:

// Input: arr[] = [2, 3, 1, 2, 3]
// Output: [2, 3] 
// Explanation: 2 and 3 occur more than once in the given array.
// Input: arr[] = [3, 1, 2] 
// Output: []
// Explanation: There is no repeating element in the array, so the output is empty.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicates{
    public ArrayList<Integer> findDuplicates(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int key = e.getKey();
            int value = e.getValue();
            if(value > 1){
                result.add(key);
            }
        }
        return result;
    }
}

// public ArrayList<Integer> findDuplicates(int[] arr) {
//         Arrays.sort(arr);
//         ArrayList<Integer> result = new ArrayList<>();
        
//         for(int i = 1; i < arr.length; i++){
//             if(arr[i] == arr[i-1]){
//                 result.add(arr[i]);
//             }
//         }
        
//         return result;
//     }