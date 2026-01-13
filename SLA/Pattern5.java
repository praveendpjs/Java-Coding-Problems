public class Pattern5 {
    public static void main(String[] args) {
        int n = 6; // size of heart

        // Top part of heart (Two humps)
        for (int i = n / 2; i <= n; i += 2) {
            // left spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // Left stars

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces between left and right hump
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bottom part of heart(inverted triangle)
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
