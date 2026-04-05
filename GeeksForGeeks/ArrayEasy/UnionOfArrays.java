// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=1&difficulty=Easy&sortBy=difficulty
// Union of Arrays with Duplicates
// You are given two arrays a[] and b[], return the Union of both the arrays in any order.

// The Union of two arrays is a collection of all distinct elements present in either of the arrays. If an element appears more than once in one or both arrays, it should be included only once in the result.

// Note: Elements of a[] and b[] are not necessarily distinct.
// Note that, You can return the Union in any order but the driver code will print the result in sorted order only.

// Examples:

// Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
// Output: [1, 2, 3]
// Explanation: Union set of both the arrays will be 1, 2 and 3.
// Input: a[] = [1, 2, 3], b[] = [4, 5, 6] 
// Output: [1, 2, 3, 4, 5, 6]
// Explanation: Union set of both the arrays will be 1, 2, 3, 4, 5 and 6.
// Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] 
// Output: [1, 2]
// Explanation: Union set of both the arrays will be 1 and 2.

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArrays {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : a){
            set.add(num);
        }
        
        for(int num : b){
            set.add(num);
        }
        
        return new ArrayList<>(set);
    }
}

// I tried this but runtime exeeded:
// public static ArrayList<Integer> findUnion(int[] a, int[] b) {
//         // code here
//         ArrayList<Integer> result = new ArrayList<>();
//         for(int num: a){
//             if(!result.contains(num)){
//                 result.add(num);
//             }
//         }
//         for(int num: b){
//             if(!result.contains(num)){
//                 result.add(num);
//             }
//         }
//         return result;
//     }