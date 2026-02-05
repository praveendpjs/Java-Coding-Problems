// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
// You are given a 3-digit number n, Find whether it is an Armstrong number or not.

// An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371. 

// Examples:

// Input: n = 153
// Output: true
// Explanation: 153 is an Armstrong number since 1^3 + 5^3 + 3^3 = 153. 
// Input: n = 372
// Output: false
// Explanation: 372 is not an Armstrong number since 3^3 + 7^3 + 2^3 = 378. 
// Input: n = 100
// Output: false
// Explanation: 100 is not an Armstrong number since 1^3 + 0^3 + 0^3 = 1. 

package GeeksForGeeks;

public class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // Count digits
        int digits = String.valueOf(number).length();

        //or do this to count the digits
        // int originalNumber2 = number;
        // while(originalNum2 != 0){
        //     digits++;
        //     originalNum2 /= 10;
        // }

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}

// Naive approach we don't use any built in function

// Function to calculate x raised to the power y
    // public static int power(int x, int y) {
    //     if (y == 0)
    //         return 1;
    //     if (y % 2 == 0)
    //         return power(x, y / 2) * power(x, y / 2);
    //     return x * power(x, y / 2) * power(x, y / 2);
    // }

    // // Function to count number of digits
    // public static int order(int n) {
    //     int t = 0;
    //     while (n != 0) {
    //         t++;
    //         n = n / 10;
    //     }
    //     return t;
    // }

    // // Function to check whether the given number is Armstrong or not
    // public static boolean armstrong(int n) {
    //     int x = order(n);
    //     int temp = n, sum = 0;

    //     while (temp != 0) {
    //         int r = temp % 10;
    //         sum += power(r, x);
    //         temp = temp / 10;
    //     }

    //     return sum == n;
    // }