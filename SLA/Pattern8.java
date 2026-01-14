
import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (half of the diamond): ");
        int halfHeight = sc.nextInt();

        // Upper half (including middle)
        for (int i = 1; i <= halfHeight; i++) {

            // Print leading spaces
            for (int spaces = 0; spaces < halfHeight - i; spaces++) {
                System.out.print(" ");
            }

            // Print stars
            for (int stars = 0; stars < 2 * i - 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = halfHeight - 1; i >= 1; i--) {

            // Print leading spaces
            for (int spaces = 0; spaces < halfHeight - i; spaces++) {
                System.out.print(" ");
            }

            // Print stars
            for (int stars = 0; stars < 2 * i - 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();    }
}
