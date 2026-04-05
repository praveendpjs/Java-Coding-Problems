// https://www.geeksforgeeks.org/problems/search-in-a-matrix--021840/0?page=1&sortBy=difficulty
// Given a 2D integer array mat[][] and a number x, find whether element x is present in the matrix or not.

// Examples:

// Input: mat[][] = [[6, 23, 21],[4, 45, 32],[69, 11, 87]], x = 32
// Output: true
// Explanation: 32 is present in the matrix, so the output is 1.
// Input: mat[][] = [[14, 34, 23, 95, 43, 28]], x = 55
// Output: false
// Explanation: 55 is not present in the matrix, so the output is 0.
// Input: mat[][] = [[87, 9, 99],[101, 3, 111]], x = 101
// Output: true
// Explanation: 101 is present in the matrix.
package GeeksForGeeks;

public class Searchin2D {
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat1 = { { 6, 23, 21 }, { 4, 45, 32 }, { 69, 11, 87 } };
        int x = 32;
        System.out.println(searchMatrix(mat1, x));
    }
}
