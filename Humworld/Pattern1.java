// print this pattern in java 
// 1 2 3 4 5 
//  2 3 4 5 
//   3 4 5 
//    4 5 
//     5 
package Humworld;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }

            // print numbers
            for (int num = i; num <= n; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
