public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int s = 0; s < 6 - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Another method
// int n = 5;

// 	        for (int i = 1; i <= n; i++) {

// 	            // spaces
// 	            for (int j = 1; j <= n - i; j++) {
// 	                System.out.print(" ");
// 	            }

// 	            // stars
// 	            for (int j = 1; j <= (2 * i - 1); j++) {
// 	                System.out.print("*");
// 	            }

// 	            System.out.println();
// 	        }