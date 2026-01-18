// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
// Find the missing number in an array from 0 to n. No duplicates sorted array given. Test case 1: A = {0,1,3} output = 2; 
// Test case 2: A = {0,1,2,3} output = 4; Test case 3 {1,2,3} output = 0
public class findMissingNum {
    public static int findMissingNumber(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 1 };
        int[] arr2 = {0,1,2,3};
        int[] arr3 = {1,2,3};
        System.out.println(findMissingNumber(arr));
        System.out.println(findMissingNumber(arr2));
        System.out.println(findMissingNumber(arr3));
    }
}
