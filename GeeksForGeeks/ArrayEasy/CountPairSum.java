package GeeksForGeeks;

// https://www.geeksforgeeks.org/problems/count-pair-sum5956/1?page=1&sortBy=difficulty

// Count pair sum
// Given two sorted arrays arr1 and arr2 of distinct elements. Given a value x. The problem is to count all pairs from both arrays whose sum equals x.
// Note: The pair has an element from each array.

// Examples:

// Input: x = 10, arr1[] = [1, 3, 5, 7], arr2[] = [2, 3, 5, 8] 
// Output: 2
// Explanation: The pairs are: (5, 5) and (7, 3).  
// Input: x = 5, arr1[] = [1, 2, 3, 4], arr2[] = [5, 6, 7, 8]
// Output: 0
// Explanation: There are no valid pairs.
// Expected Time Complexity: O(n+m).
// Expected Auxiliary Space: O(1).


// Brute force not good but I did it in my first attempt
public class CountPairSum {
    static int countPairs(int arr1[], int arr2[], int x) {
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] + arr2[j] == x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
// Two pointer approach
    // static int countPairs(int arr1[], int arr2[], int x) {
    //     int count = 0;
    //     int i = 0;
    //     int j = arr2.length - 1;
        
    //     while(i < arr1.length && j >= 0){
    //         int sum = arr1[i] + arr2[j];
    //         if(sum == x){
    //             count++;
    //             i++;
    //             j--;
    //         }else if(sum < x){
    //             i++;
    //         }else{
    //             j--;
    //         }
    //     }
    //     return count;
    // }