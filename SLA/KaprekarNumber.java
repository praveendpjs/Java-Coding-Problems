// A Kaprekar number is a number whose square when divided into two parts and such that sum of parts is equal to the original number and none of the parts has value 0. Given a number, the task is to check if it is Kaprekar number or not. Examples: Input : n = 45 Output : Yes Explanation : 45^2 = 2025 and 20 + 25 is 45
public class KaprekarNumber {
    static boolean isKaprekar(int n) {

        if (n == 1) return true;  // 1 is Kaprekar

        long square = (long) n * n;

        int digits = String.valueOf(n).length();

        long right = square % (long) Math.pow(10, digits);
        long left  = square / (long) Math.pow(10, digits);

        if (right == 0) return false;

        return (left + right == n);
    }

    public static void main(String[] args) {
        int n = 45;

        if (isKaprekar(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
