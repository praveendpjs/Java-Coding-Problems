// https://leetcode.com/problems/sqrtx/description/

// 69. Sqrt(x)
// Hint
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

public class SquareRoot {
    public static int mySqrt(int x) {
        if (x < 2)
            return x;

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) { // safe check, no overflow
                ans = mid; // mid is possible answer
                left = mid + 1; // try for bigger
            } else {
                right = mid - 1; // mid too big
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
        System.out.println(mySqrt(8));
    }
}
