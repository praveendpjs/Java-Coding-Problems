// https://leetcode.com/problems/climbing-stairs/description/
// 70. Climbing Stairs
// Hint
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

public class ClimbStairs {
    // This is just fibonacci series
    public static int climbStairs(int n) {
        if (n <= 2)
            return n;

        int prev2 = 1; // ways to reach step 1
        int prev1 = 2; // ways to reach step 2
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
    }
}

// Using recursive function time complexity is huge
// public static int climb(int n) {
//     if (n <= 2)
//         return n;
//     return climb(n - 1) + climb(n - 2);

// }

// public static void main(String[] args) {
//     System.out.println(climb(4));
//     System.out.println(climb(5));
// }

// uses additional memory
// int climbStairs(int n) {
//     if (n <= 2) return n;

//     int[] dp = new int[n+1];
//     dp[1] = 1;
//     dp[2] = 2;

//     for (int i = 3; i <= n; i++) ,{
//         dp[i] = dp[i-1] + dp[i-2];
//     }

//     return dp[n];
// }