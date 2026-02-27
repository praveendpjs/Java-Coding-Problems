// 322. Coin Change

// You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

// Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

// You may assume that you have an infinite number of each kind of coin.

// Example 1:

// Input: coins = [1,2,5], amount = 11
// Output: 3
// Explanation: 11 = 5 + 5 + 1
// Example 2:

// Input: coins = [2], amount = 3
// Output: -1
// Example 3:

// Input: coins = [1], amount = 0
// Output: 0

// This question was asked in UNCIA company I used greedy solution instead of dynamic approach it would still work for that problem because they used US dollars.

// Stand proud you are strong
package Leetcode.MediumArray;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);  // sentinel (impossible large value)
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}

// Take:

// coins = [1, 3, 4]
// amount = 6

// This example is perfect because greedy fails here.

// Greedy would do:
// 6 → 4 → 2 → 1 → 0
// Coins used = 3

// But optimal is:
// 6 → 3 → 0
// Coins used = 2

// If your instinct says “just take biggest first”, that instinct needs retraining.

// We define:

// dp[i] = minimum coins needed to make amount i

// Initialize:

// dp[0] = 0
// Everything else = amount + 1 (which is 7 here, meaning “impossible” initially)

// So initially:

// i: 0 1 2 3 4 5 6
// dp: 0 7 7 7 7 7 7

// Now we fill from 1 → 6.

// i = 1

// Try each coin:

// coin 1 → dp[1 - 1] + 1 = dp[0] + 1 = 1
// coin 3 → invalid
// coin 4 → invalid

// dp[1] = 1

// Now:

// 0 1 7 7 7 7 7

// i = 2

// coin 1 → dp[2 - 1] + 1 = dp[1] + 1 = 2
// coin 3 → invalid
// coin 4 → invalid

// dp[2] = 2

// 0 1 2 7 7 7 7

// i = 3

// coin 1 → dp[2] + 1 = 3
// coin 3 → dp[0] + 1 = 1
// coin 4 → invalid

// Take min → 1

// dp[3] = 1

// 0 1 2 1 7 7 7

// Notice something important.
// We didn't construct 3 as 1+1+1 first and stop.
// We checked all coins. That’s why DP works. It evaluates all possible last steps.

// i = 4

// coin 1 → dp[3] + 1 = 2
// coin 3 → dp[1] + 1 = 2
// coin 4 → dp[0] + 1 = 1

// Minimum = 1

// dp[4] = 1

// 0 1 2 1 1 7 7

// i = 5

// coin 1 → dp[4] + 1 = 2
// coin 3 → dp[2] + 1 = 3
// coin 4 → dp[1] + 1 = 2

// Minimum = 2

// dp[5] = 2

// 0 1 2 1 1 2 7

// i = 6

// coin 1 → dp[5] + 1 = 3
// coin 3 → dp[3] + 1 = 2
// coin 4 → dp[2] + 1 = 3

// Minimum = 2

// dp[6] = 2

// Final table:

// i: 0 1 2 3 4 5 6
// dp: 0 1 2 1 1 2 2

// Answer = dp[6] = 2

// Correct solution: 3 + 3.


// Greedy solution it won't work for this problem.
// Greedy works for:
// [1,5,10,25] (US coins)
// Many currency systems are specifically designed so greedy works.

// But for arbitrary input? Not safe.

// This was the solution I solved at UNCIA so stand proud you are strong.
//  public int coinChangeGreedy(int[] coins, int amount) {
//         Arrays.sort(coins);  // sort ascending
//         int count = 0;
        
//         for (int i = coins.length - 1; i >= 0; i--) {
//             while (amount >= coins[i]) {
//                 amount -= coins[i];
//                 count++;
//             }
//         }
        
//         return amount == 0 ? count : -1;
//     }