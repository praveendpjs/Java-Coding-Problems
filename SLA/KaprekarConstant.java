// https://www.geeksforgeeks.org/dsa/kaprekar-constant/
// 6174 is the Kaprekar Constant. This number is special as we always get this number when following steps are followed for any four digit number such that all digits of number are not same, i.e., all four digit numbers excluding (0000, 1111, ...)


// Sort four digits in ascending order and store result in a number "asc".
// Sort four digits in descending order and store result in a number "desc".
// Subtract number larger number from smaller number, i.e., abs(asc - desc).
// Repeat above three steps until the result of subtraction doesn't become equal to the previous number.
// We always end up with 6174.

import java.util.Arrays;

public class KaprekarConstant{
    static int kaprekar(int n) {

        int prev;

        while (true) {

            // store current number
            prev = n;

            // Step 1: extract digits
            int[] digits = new int[4];
            int temp = n;

            for (int i = 0; i < 4; i++) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }

            // Step 2: sort ascending
            Arrays.sort(digits);

            // Step 3: build ascending number
            int asc = 0;
            for (int i = 0; i < 4; i++) {
                asc = asc * 10 + digits[i];
            }

            // Step 4: build descending number
            int desc = 0;
            for (int i = 3; i >= 0; i--) {
                desc = desc * 10 + digits[i];
            }

            // Step 5: subtract
            int diff = Math.abs(desc - asc);

            System.out.println(desc + " - " + asc + " = " + diff);

            // Step 6: stopping condition
            if (diff == prev) {
                return diff;
            }

            // Step 7: update n for next iteration
            n = diff;
        }
    }

    public static void main(String[] args) {
        int result = kaprekar(9812);
        System.out.println("Kaprekar constant: " + result);
    }
}